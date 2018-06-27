#!/bin/env groovy
/******************************************************************************
Class: ResourcePropertyReader - To read properties from shared lib resources
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/

package uob.jenkins.shared.common
import groovy.util.ConfigSlurper

// get value for the given property from library resource folder
String getPropertyValue(String propertyFile, String property){
    
    // for debugging - println "Starting ResourcePropertyReader.getPropertyValue()...."

    def propertyFileResource = libraryResource propertyFile
    def props = new Properties()
    props.load(new DataInputStream(new ByteArrayInputStream(propertyFileResource.getBytes())))
    def config = new ConfigSlurper().parse(props)

    // for debugging - println "Finishing ResourcePropertyReader.getPropertyValue()...."
    return config."${property}"

}
return this
