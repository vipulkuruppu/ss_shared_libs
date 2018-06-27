#!/bin/env groovy
package uob.jenkins.shared.common
import uob.jenkins.shared.common.ResourcePropertyReader

class JenkinsSlave {
    
    String getLogonUser(String slave){

        //def slave_properties = 'slaves/' + slave + '/slave.properties'
        println "Starting JenkinsSlave.getLogonUser()...."
        def propReader = new uob.jenkins.shared.common.ResourcePropertyReader()

        println "Finishing JenkinsSlave.getLogonUser()...."
        return propReader.getPropertyValue('/tmp/slave.properties', 'logon.user')
    }
}