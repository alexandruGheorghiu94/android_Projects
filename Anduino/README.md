Anduino
========

This application allows the users of Android devices to learn about the Arduino ecosystem and how to use the core functions of the board: the use of analog & digital signals and also implementation of the most known example used on the Arduino board (Blink of an LED and the fade in & out of an LED).

##GUI
The app is composed of 7 activities, each activity is represented by a class that can be seen in the UML diagram seen below.

![Fig 1](description_images/img1.PNG?raw=true "Indoor Location Detection")



Simple test for sending and receiving data to a Bluetooth Low Energy UART service from an Android 4.3 or 4.4 device.

[Load the APK](https://github.com/tdicola/BTLETest/raw/master/app/BTLETest.apk) on your Android 4.3 or 4.4 device (highly suggest 4.4 as BTLE is quite unstable in Android!).  Make sure to [enable loading apps from unknown sources](http://developer.android.com/distribute/open.html#unknown-sources) first.

Build a simple Bluefruit LE + Arduino circuit and load the Bluefruit LE library echoDemo on the Arduino.

Make sure bluetooth is enabled, then load the BLETest application (has a generic Android icon).  Once started the app will immediately search for BTLE devices and connect to the first one it finds with the UART service.  Status messages will be displayed in a text view on the screen.  

Once you see the connected and services discovered message, try typing text in the edit view at the top and click Send to send it to the Arduino.  From the Arduino side try sending text from its serial monitor to the BLETest app.

The source for this app is written in the latest version (0.53) of [Android Studio](http://developer.android.com/sdk/installing/studio.html).
