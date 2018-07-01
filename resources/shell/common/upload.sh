#!/bin/bash

userID=$0
hostName=$1
sourceDir=$2
destDir=$3
fileName=$4

# upload file
scp ${sourceDir}/${fileName} ${userID}@${hostName}:${destDir}/
