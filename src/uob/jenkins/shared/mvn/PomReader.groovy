#!/bin/env groovy
/******************************************************************************
Class: PomReader - read given pom.xml
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/
package uob.jenkins.shared.mvn

//import groovy.json.JsonSlurper
//import groovy.util.XmlSlurper

// get POM version
String getPOMVersion(String pomFile)
{
    String pomVersion
    if (pomFile == ''){
        // pomFile null means something wrong 
        pomVersion = "null"
    } else {
        //pomVersion = new XmlSlurper().parse(new File(pomFile)).version.text()
        pomVersion = (readFile(pomFile) =~ '<version>(*)</version>')[0][1]
    }
    return pomVersion
}
