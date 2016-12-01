Anduino
========

This application allows the users of Android devices to learn about the Arduino ecosystem and how to use the core functions of the board: the use of analog & digital signals and also implementation of the most known example used on the Arduino board (Blink of an LED and the fade in & out of an LED).

##Instalation
In order to get the app on your phoen you have 2 option:
1) import the project into Android Studio and run it on the device you with. Note that you must have USB debugging active in the developers options tab.
2) Download the project and search in its folder the "app-debug.apk" file. Transfer in onto your device and install it. Make sure to [enable loading apps from unknown sources](http://developer.android.com/distribute/open.html#unknown-sources) first.

##GUI
The app is composed of 7 activities, each activity is represented by a class that can be seen in the UML diagram seen below.


| <img src="https://raw.githubusercontent.com/alexandruGheorghiu94/android_Projects/master/Anduino/description_images/img1.PNG" width="800"> |
| :---: |
| Fig. 1 UML diagram | 


At startup you enter in the welcome screen where you have only 1 option: to enter in the list containing the tutorials.

| ![](description_images/img10.png?raw=true "img1") | ![](description_images/img12.png?raw=true "img1") |
| :---: | :---: |
| Fig. 2 Intro screen | Fig. 3 List of tutorial activity |

The tutorial activity is composed of sub-menus that lead to their respective tutorial where the user can do a certain task. The **Introduction** activity represented by the __"Avant de commencer"__ sub-menu contains info about Arduino and the things required in order to use the practical part.

| ![](description_images/img2.png?raw=true "img1") | ![](description_images/img3.png?raw=true "img1") |
| :---: | :---: |
| Fig. 4 Introduction activity | Fig. 5 Connexion monitor |

All the activities that are lauched from the list menu exept the Introduction activity contain a bluetooth connexion protocol. In order to see if the bluetooth connexion is establised each activity also contains a bluetooth connexion monitor (Fig. 5) that has the role of informing the user if the Android device is connected to the Arduino board.

Make sure bluetooth is enabled, then load the BLETest application (has a generic Android icon).  Once started the app will immediately search for BTLE devices and connect to the first one it finds with the UART service.  Status messages will be displayed in a text view on the screen.  
