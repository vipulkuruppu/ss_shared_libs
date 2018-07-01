#!/bin/env groovy
/******************************************************************************
Var: prepareSSCompileEnv - compile and build packsge
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/
// prepareSSCompileEnv( baseModule: 'CORE', logFile: "${WORKSPACE}/logs/pipeline.log" )
// baseModule = CORE, ID, SG, etc

def call(Map prepare){

    assert prepare.baseModule : "ERROR: Empty baseModule provided"
    assert prepare.logFile : "ERROR: No logFile provided"

    sh "echo 'Prepared compile environment for '${prepare.baseModule} >> ${prepare.logFile}"


}