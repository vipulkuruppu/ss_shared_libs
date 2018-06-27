#!/bin/env groovy
package uob.jenkins.shared.common
import groovy.util.ConfigSlurper


String getPropertyValue(String propertyFile, String property){
    
    println "Starting ResourcePropertyReader.getPropertyValue()...."

    def propertyFileResource = libraryResource propertyFile
    def props = new Properties()
    props.load(new DataInputStream(new ByteArrayInputStream(propertyFileResource.getBytes())))
    def config = new ConfigSlurper().parse(props)

    println "Finishing ResourcePropertyReader.getPropertyValue()...."
    return config."${property}"

}
return this
