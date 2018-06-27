#!/bin/env groovy
/******************************************************************************
Var: getPOMVersion - read given pom.xml using uob shared lib and return version
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/

import uob.jenkins.shared.mvn.*

def call(String pomFile){
    def pomReader = new uob.jenkins.shared.mvn.PomReader()
    return pomReader.getPOMVersion(pomFile)
}
