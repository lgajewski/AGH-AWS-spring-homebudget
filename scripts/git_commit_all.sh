#!/bin/bash

CMD="git commit $@"

scripts_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )

# Commit in each repository first
bash "$scripts_path/submodules_exec.sh" $CMD

# Commit in central repo
eval $CMD
