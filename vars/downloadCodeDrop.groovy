#!/bin/env groovy
/******************************************************************************
Var: downloadCodeDrop - download code drop zip from nexus release repo
Author: Vipul Kuruppu (unckur)
Created on: 28-06-2018
******************************************************************************/

def call(Map download){

    def nexus_repo_base = "http://lxclstsgv99.sg.uobnet.com:8888/repository/plce-release"
    def nexus_drop_url = nexus_repo_base + '/' + download.module + '/' + download.moduleVersion + '/' + download.dropVersion + '/' + download.moduleVersion + '-' + download.dropVersion + '.zip'
    sh "cd ${download.downloadDir}; pwd; wget ${nexus_drop_url}; ls -ltr"
}
