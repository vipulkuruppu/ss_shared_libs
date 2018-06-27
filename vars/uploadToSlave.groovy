#!/bin/env groovy
import uob.jenkins.shared.common.*

// upload file to slave
// prerequisite - ssh key ahthentication is already been setup
// syntax e.g. - uploadToSlave(slave: "CLSTSG80", sourceDir: "${env.download_dir}", file: "${env.core_code_drop_zip}", destinationDir: 'download')

def call(Map upload){

    // get logon user ID
    println "Starting uploadToSlave...."
    def js = new uob.jenkins.shared.common.JenkinsSlave()
    def userID = js.getLogonUser('CLSTSG80')
    println "Finishing uploadToSlave...."

    println userID

    // create remote destination if not available
    //echo 'ssh ${userID}@${upload.slave} << _eoc; if [ -d ${WORKSPACE}/${upload.destinationDir} ]; then mkdir -p ${WORKSPACE}/${upload.destinationDir}; fi; _eoc'

}