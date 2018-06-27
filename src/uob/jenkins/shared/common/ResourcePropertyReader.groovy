#!/bin/env groovy
package uob.jenkins.shared.common
import groovy.util.ConfigSlurper


String getPropertyValue(String propertyFile, String property){
    def propertyFileResource = libraryResource propertyFile
    println "Starting ResourcePropertyReader.getPropertyValue()...."
    def props = new Properties()
    def propFile = new File(propertyFileResource)
    props.load(propFile.newDataInputStream())
    def config = new ConfigSlurper("${property}").parse(props)
        
    println "Finishing ResourcePropertyReader.getPropertyValue()...."
    return config."${property}"

}
return this
