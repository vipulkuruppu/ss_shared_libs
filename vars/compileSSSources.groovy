#!/bin/env groovy
/******************************************************************************
Var: compileSSSources - compile and build packsge
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/
// compileSSSources( baseModule: 'CORE', module: 'online', logFile: "${WORKSPACE}/logs/pipeline.log" )
// baseModule = CORE, ID, SG, etc
// module = online, batch, reports, scripts, templates

def call(Map compile){

    assert compile.baseModule : "ERROR: Empty baseModule provided"
    assert compile.logFile : "ERROR: No logFile provided"

    sh "echo 'Compiled '${compile.baseModule} >> ${compile.logFile}"


}