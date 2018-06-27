#!/bin/env groovy
package uob.jenkins.shared.common
import groovy.util.ConfigSlurper


String getPropertyValue(String propertyFile, String property){
    
    println "Starting ResourcePropertyReader.getPropertyValue()...."

    def propertyFileResource = libraryResource propertyFile
    def props = new Properties()
    def stream = new ByteArrayInputStream(propertyFileResource.getBytes())
    props.load(new DataInputStream(stream))
    //def config = new ConfigSlurper("${property}").parse(props)
    def config = new ConfigSlurper().parse((new Properties()).load(new DataInputStream(new ByteArrayInputStream(propertyFileResource.getBytes()))))

    println "Finishing ResourcePropertyReader.getPropertyValue()...."
    return config."${property}"

}
return this
