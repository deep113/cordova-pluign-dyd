	package com.dydplugin.plugin;
	
	import java.io.File;
  
	import org.apache.cordova.CallbackContext;
	import org.apache.cordova.CordovaInterface;
	import org.apache.cordova.CordovaPlugin;
	import org.apache.cordova.LOG;
	import org.apache.cordova.PluginResult;
	import org.json.JSONArray;
	import org.json.JSONException;
	import org.json.JSONObject;
	
	import android.annotation.SuppressLint;
	import android.app.AlertDialog;
	import android.app.AlertDialog.Builder;
	import android.app.ProgressDialog;
	import android.content.DialogInterface;
	import android.media.Ringtone;
	import android.media.RingtoneManager;
	import android.net.Uri;
	import android.widget.EditText;
	import android.widget.TextView;
	import android.widget.Toast;
	
	import android.content.Intent;
	import android.net.Uri;
	import android.os.Environment;

    import com.darsh.multipleimageselect.activities.AlbumSelectActivity;
    import com.darsh.multipleimageselect.helpers.Constants;
    import com.darsh.multipleimageselect.models.Image;

    import java.util.ArrayList;

    /**
     * This class echoes a string called from JavaScript.
     */
    public class Dyd extends CordovaPlugin {

    private CallbackContext callbackContext;
	private JSONObject params;
	
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		this.callbackContext = callbackContext;
       if (action.equals("getmultipleimages")) {
            
            Intent intent = new Intent(cordova.getActivity(), AlbumSelectActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_LIMIT, 1000);
            this.cordova.startActivityForResult((CordovaPlugin) this,intent, Constants.REQUEST_CODE);
            return true;
        }
		else {
            
            return false;

        }
    }
	
   

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.REQUEST_CODE && data != null) {
            ArrayList<Image> images = data.getParcelableArrayListExtra(Constants.INTENT_EXTRA_IMAGES);
            StringBuffer stringBuffer = new StringBuffer();
            JSONArray res = new JSONArray();
            for (int i = 0, l = images.size(); i < l; i++) {
                //stringBuffer.append(images.get(i).path + "\n");
                res.put(images.get(i).path);
            }
			
			//Toast.makeText(this.cordova.getActivity(), stringBuffer.toString(), Toast.LENGTH_SHORT).show();
			this.callbackContext.success(res);
			//callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK,res));
        }
    }

	
	
	
	

	
  }