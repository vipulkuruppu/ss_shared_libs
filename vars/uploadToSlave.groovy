#!/bin/env groovy
/******************************************************************************
Var: uploadToSlave - upload file to slave
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/
// prerequisite - ssh key ahthentication is already been setup
// syntax e.g. - uploadToSlave(slave: "CLSTSG80", sourceDir: "${env.download_dir}", file: "${env.core_code_drop_zip}", destinationDir: 'download', logFile: "${WORKSPACE}/logs/pipeline.log")

import uob.jenkins.shared.common.*

def call(Map upload){

    // get logon user ID and path
    def js = new uob.jenkins.shared.common.JenkinsSlave()
    def userID = js.getLogonUser(upload.slave)
    def slaveJKWorkSpace = js.getJenkinsHome(upload.slave) + '/workspace/' + "${JOB_NAME}"

    println "Using ID \"" + userID + "\"" + " to upload " + upload.file + " in to " + slaveJKWorkSpace + "/" + upload.destinationDir + " in Slave " + upload.slave

    // upload file using resouce script
    def uploadScript = libraryResource 'shell/common/upload.sh'
    sh "bash -c '${uploadScript}' ${userID} ${upload.slave} ${upload.sourceDir} ${slaveJKWorkSpace}/${upload.destinationDir} ${upload.file} >> ${upload.logFile}"

}