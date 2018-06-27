#!/bin/env groovy
package uob.jenkins.shared.common
import uob.jenkins.shared.common.ResourcePropertyReader
    
String getLogonUser(String slave){

    println "Starting JenkinsSlave.getLogonUser()...."
    def slave_properties = 'slaves/' + slave + '/slave.properties'
    def propReader = new uob.jenkins.shared.common.ResourcePropertyReader()

    println "Finishing JenkinsSlave.getLogonUser()...."
    return propReader.getPropertyValue(slave_properties, 'logonuser')
}
return this
