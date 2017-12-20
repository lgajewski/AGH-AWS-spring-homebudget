#!/bin/bash

#Use set -x if you want to echo each command while getting executed
#set -x

REPO_PREFIX=spring-homebudget-rest-
REPO_SUBMODULE_LIST=(notify react stats users)

for submodule in "${REPO_SUBMODULE_LIST[@]}"; do
    dir=$REPO_PREFIX$submodule
    cd $dir
    echo "[$dir]: $@"
    eval "$@"
    cd ..
done