/*global cordova, module*/

var exec = require('cordova/exec');
var platform = require('cordova/platform');

module.exports = {
	 getmultipleimages: function(completeCallback, failCallback, limit) {
        exec(completeCallback, failCallback, "Dyd", "getmultipleimages", [limit]);
    }
};