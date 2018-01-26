#!/bin/sh

URL="http://homebudget-cicd-alb-1924033504.eu-west-1.elb.amazonaws.com/"
INTERVAL=0.5

services=(stats users)
default_log_levels=( info warn error )


log_levels=( "$@" )
if [ $# -eq 0 ]
  then
    echo "[CONFIG] No arguments passed. Using default log levels."
    log_levels=( "${default_log_levels[@]}" )
fi

printf "[CONFIG] Log levels: "
printf '%s ' "${log_levels[@]}"
echo ""

while true; do
    for service in "${services[@]}"
    do
        for log_level in "${log_levels[@]}"
        do
            response=`curl -s -o /dev/null -w '%{http_code}' -X POST $URL"$service-service/log/$log_level"`
            echo "[HTTP] Request to $service-service/log/$log_level returned: $response"
            sleep $INTERVAL
        done
    done
done
