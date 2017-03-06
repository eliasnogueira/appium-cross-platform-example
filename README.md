The Fastip app can be downloads by this repository
https://github.com/ptraeg/mobile-apps-4-ways

I have built the apps for Android and iOS platform, and these are located in app folder

To inspect iOS elements I'm using Macaca App Inspector project
https://macacajs.github.io/app-inspector/

Issue with Appium 1.6.3
https://github.com/facebook/WebDriverAgent/issues/372

Please downgrade Appium to 1.6.2

OBS:
In my case, that I've installed Appium on MacOSX with sudo, I've executed the following command (give write access to node_modules):
sudo chmod -R 777 /usr/local/lib/node_modules
