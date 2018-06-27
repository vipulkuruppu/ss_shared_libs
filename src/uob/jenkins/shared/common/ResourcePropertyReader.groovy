#!/bin/env groovy
package uob.jenkins.shared.common
import groovy.util.ConfigSlurper


String getPropertyValue(String propertyFile, String property){
    
    println "Starting ResourcePropertyReader.getPropertyValue()...."

    def propertyFileResource = libraryResource propertyFile
    def props = new Properties()
    //def propFile = new File(propertyFileResource)
    props.load(propertyFileResource.newDataInputStream())
    def config = new ConfigSlurper("${property}").parse(props)
        
    println "Finishing ResourcePropertyReader.getPropertyValue()...."
    return config."${property}"

}
return this
