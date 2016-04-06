#cordova-pluign-dyd

Cordova Plugin For Multiple Image Selection - implemented for Android.

#Installing the plugin

cordova plugin add https://github.com/deep113/cordova-pluign-dyd.git

#Usage

Include this library in your project using gradle.

repositories {
  maven {
    url "https://jitpack.io"
  }
}

dependencies {
  compile 'com.github.darsh2:MultipleImageSelect:v0.0.3'
}




#Example


dyd.getmultipleimages(completeCallback,failCallback,1000);


function completeCallback(imgselcresults){

console.log(imgselcresults);

}


function failCallback(error){

console.log(error);

}

#Note

This plugin only for Android

		