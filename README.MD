Java OVH API
============

This repository contains an automatically generated (excepted for 3 source files) Java API for the OVH's APIv6.

## How to compile ?

Just run `mvn install javadoc:javadoc` and start working ! Please pay attention to the project dependencies, listed in the pom.xml file. They are NOT included in the jar, so you have to insure they are included in the classpath when you run a program using this API.

## How to use ?

You just have to create a client using `OVHClientManager`'s `createClient` and `getClient` methods. Here is the source file : https://github.com/zyuiop/JavaOVHApi/blob/master/src/main/java/net/zyuiop/ovhapi/OVHClientManager.java

The client itself contains methods corresponding to the various OVH API domains. You can find a list of these domains here : https://api.ovh.com/console

Each interface is documented, using documentation that was automatically generated from the OVH API official documentation.

The json used to generate this stuff is 3-4 months old (as of june 2016), so new APIs might have been added recently.

## A problem ?

As these source are automatically generated, some errors might happen. Feel free to report them on this repository and I'll try to fix them as soon as I can !
