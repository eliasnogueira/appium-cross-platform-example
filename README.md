# Read this before project execution


### About the apps
The Fastip app can be downloaded by this repository
[https://github.com/ptraeg/mobile-apps-4-ways](https://github.com/ptraeg/mobile-apps-4-ways)

I have built the apps for Android and iOS platform, and these are located in app folder.


### Android

#### Configurations
To execute the examples over the Android platform you'll need:
* Android SDK
* Updated _Build Tools_, _Platform Tools_ and, at least, one _System Image (Android Version)_
* Configure Android Path on your environment variables
   * ANDROID_HOME: root android sdk directory
   * PATH: ANDROID_HOME + the following paths = _platform-tools_, _tools_, _tools/bin_ 
* And Android Virtual Device
   * AVD or Genymotion
   

#### Inspect elements on Android
You can use the [uiautomatorviewer](https://developer.android.com/training/testing/ui-testing/uiautomator-testing.html) to inspect elements on Android devices.
 or you can use [Appium Desktop](https://github.com/appium/appium-desktop)

### iOS

#### Configurations
To execute the examples over the iOS platform you'l need:
* MacOS machine :-)
* Xcode installed
* iPhone simulator (I recommend, for these tests iOS version > 10)
* Follow all the steps on [https://github.com/appium/appium-xcuitest-driver](https://github.com/appium/appium-xcuitest-driver)


#### Inspect elementos on iOS
You also can use [Appium Desktop](https://github.com/appium/appium-desktop)
or you can use the [Macaca App Inspector](https://macacajs.github.io/app-inspector/)

#### Execution
On a MacOs machine give write access to _node_modules_:
`sudo chmod -R 777 /usr/local/lib/node_modules`

### Appium
Try to always have Appium and libraries updated.
* Verify the core Appium version on [npm appium site](https://www.npmjs.com/package/appium). To see your Appium version run `appium --version` on Terminal
* Verify the Appium library version on [https://github.com/appium/java-client](https://github.com/appium/java-client)
   * If it differ from _pom.xml_ file, update it!

### Project execution
First you'll need to install Appium via npm and start the server at Terminal running the following command: `appium --session-override`

And before the execution set the proper values to _config.properties_ file. This file will get all information about platform, platform versions, app, and other information.

What you need to do on this file:
* alter _run.platform_ to set the platform execution (ios or android)
* set the proper device name for ios and android
   * in my example I'm using simulators
* set the proper platform version (mainly for ios)
   
   
### About the tests
On the package _com.eliasnogueira.basic_ you'll find two tests: one for Android and another for iOS, both using Page Objects.
   
On the package _com.eliasnogueira.unique_script_ you'l find the _unique script_ that's use the information on _config.properties_ to execute the tests in Android or iOS

### Any question, error or feedback?
Please fill an issue ;-)



