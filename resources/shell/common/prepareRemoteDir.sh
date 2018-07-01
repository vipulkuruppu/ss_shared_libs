#!/bin/bash

userID=$0
hostName=$1
destDir=$2

# check and create remote dir
ssh ${userID}@${hostName} << _EOC
if [ -d ${destDir} ]; then
rm -rf ${destDir}/*
else
mkdir -p ${destDir}
fi
_EOC