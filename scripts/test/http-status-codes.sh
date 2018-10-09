#!/bin/sh

URL="http://homebudget-cicd-alb-1924033504.eu-west-1.elb.amazonaws.com/"
INTERVAL=0.5

services=(stats users)
default_http_codes=( 200 204 400 401 403 404 500 )


http_codes=( "$@" )
if [ $# -eq 0 ]
  then
    echo "[CONFIG] No arguments passed. Using default http codes."
    http_codes=( "${default_http_codes[@]}" )
fi

printf "[CONFIG] Http codes: "
printf '%s ' "${http_codes[@]}"
echo ""

while true; do
    for service in "${services[@]}"
    do
        for http_code in "${http_codes[@]}"
        do
            response=`curl -s -o /dev/null -w '%{http_code}' $URL"$service-service/http/$http_code"`
            echo "[HTTP] Request to $service-service/http/$http_code returned: $response"
            sleep $INTERVAL
        done
    done
done
