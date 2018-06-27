#!/bin/env groovy
/******************************************************************************
Var: uploadToSlave - upload file to slave
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/
// prerequisite - ssh key ahthentication is already been setup
// syntax e.g. - uploadToSlave(slave: "CLSTSG80", sourceDir: "${env.download_dir}", file: "${env.core_code_drop_zip}", destinationDir: 'download')

import uob.jenkins.shared.common.*

def call(Map upload){

    // get logon user ID
    def js = new uob.jenkins.shared.common.JenkinsSlave()
    def userID = js.getLogonUser(upload.slave)

    println "Using " + userID + " with Slave " + upload.slave

    // create remote destination if not available
    //echo 'ssh ${userID}@${upload.slave} << _eoc; if [ -d ${WORKSPACE}/${upload.destinationDir} ]; then mkdir -p ${WORKSPACE}/${upload.destinationDir}; fi; _eoc'

}