#!/bin/env groovy
package uob.jenkins.shared.common
//import groovy.util.ConfigSlurper

class ResourcePropertyReader {

    //@NonCPS
    String getPropertyValue(String propertyFile, String property){
        //def propertyFileResource = libraryResource 'slaves/CLSTSG80/slave.properties'
        //def config = new ConfigSlurper(property).parse(new File(propertyFile).toURL())
        println "Starting ResourcePropertyReader.getPropertyValue()...."
        def properties = new Properties()
        def propertiesFile = new File(propertyFile)
        properties.load(propertiesFile.newDataInputStream())
        def config = new ConfigSlurper().parse(properties)
        
        println "Finishing ResourcePropertyReader.getPropertyValue()...."
        return config."${property}"

    }
}

