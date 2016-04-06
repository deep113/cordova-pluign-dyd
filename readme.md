cordova-pluign-dyd
Cordova Plugin For Multiple Image Selection - implemented for Android.

Installing the plugin

cordova plugin add https://github.com/deep113/cordova-pluign-dyd.git

Usage
Include this library in your project using gradle (thanks to JitPack.io).

repositories {
  maven {
    url "https://jitpack.io"
  }
}

dependencies {
  compile 'com.github.darsh2:MultipleImageSelect:v0.0.3'
}
In project's AndroidManifest.xml, add the following under application node:

<activity
  android:name="com.darsh.multipleimageselect.activities.AlbumSelectActivity"
  android:theme="@style/MultipleImageSelectTheme">
  <intent-filter>
    <category android:name="android.intent.category.DEFAULT" />
  </intent-filter>
</activity>


Example:-

      dyd.getmultipleimages(completeCallback,failCallback,1000);
        function completeCallback(imgselcresults){
			  console.log(imgselcresults);
        }
        function failCallback(error){
            console.log(error);
        }


		