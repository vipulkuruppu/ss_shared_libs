#!/bin/env groovy
/******************************************************************************
Class: JenkinsSlave - To read jenkins slave details
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/

package uob.jenkins.shared.common
import uob.jenkins.shared.common.ResourcePropertyReader
    
String getLogonUser(String slave){

    // for debugging - println "Starting JenkinsSlave.getLogonUser()...."
    def slave_properties = 'slaves/' + slave + '/slave.properties'
    def propReader = new uob.jenkins.shared.common.ResourcePropertyReader()

    // for debugging - println "Finishing JenkinsSlave.getLogonUser()...."
    return propReader.getPropertyValue(slave_properties, 'logon.user')
}
return this
