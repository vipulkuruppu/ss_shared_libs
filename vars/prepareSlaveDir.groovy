#!/bin/env groovy
/******************************************************************************
Var: prepareSlaveDir - prepare/clean workspace directory in slave
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/
// prerequisite - ssh key ahthentication is already been setup
// syntax e.g. - prepareSlaveDir(slave: "CLSTSG80", destinationDir: 'download'), logFile: "${WORKSPACE}/logs/pipeline.log"

import uob.jenkins.shared.common.*

def call(Map slaveInfo){

    // get logon user ID and path
    def js = new uob.jenkins.shared.common.JenkinsSlave()
    def userID = js.getLogonUser(slaveInfo.slave)
    def slaveJKWorkSpace = js.getJenkinsHome(slaveInfo.slave) + '/workspace/' + "${JOB_NAME}"

    println "Using ID \"" + userID + "\"" + " to cleanup " + slaveJKWorkSpace + "/" + slaveInfo.destinationDir + " in Slave " + slaveInfo.slave
    
    // prepare/clean using resouce script
    def cleanupScript = libraryResource 'shell/common/prepareRemoteDir.sh'
    sh "bash -c '${cleanupScript}' ${userID} ${slaveInfo.slave} ${slaveJKWorkSpace}/${slaveInfo.destinationDir} >> ${slaveInfo.logFile}"

}