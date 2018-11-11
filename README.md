## Building an executable Java FX 11 application with Maven
This is an application that demonstrates how to construct an executable Java FX application.
It uses Java 11, jlink and Java FX 11. It shows three things

1. How to build a Java 11/ Java FX 11
2. How to build this application modularized.
3. How to use jlink to generate an executable for the application
4. How to do all this with Maven

### Requirements
Maven 3.5.x
Java 11 JDK

### Using the Moditect plugin

In my first attempt, I used the exec plugin to run jlink and create a runtime image.
In my second attempt, I replaced the exec plugin with the moditect plugin
(see https://github.com/moditect/moditect). With this plugin it is possible to setup 
the runtime image from within the maven pom file.

