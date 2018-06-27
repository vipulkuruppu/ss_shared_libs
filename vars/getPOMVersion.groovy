#!/bin/env groovy
import uob.jenkins.shared.mvn.*

// read given pom.xml using uob shared lib and return version
def call(String pomFile){
    def pomReader = new uob.jenkins.shared.mvn.PomReader()
    return pomReader.getPOMVersion(pomFile)
}
