#!/bin/env groovy
package uob.jenkins.shared.mvn

//import groovy.json.JsonSlurper
//import groovy.util.XmlSlurper

// read given pom.xml using XmlSlurper and return version
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
