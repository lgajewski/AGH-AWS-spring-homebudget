#!/bin/sh

URL=${1:-"http://homebudget-cicd-alb-1924033504.eu-west-1.elb.amazonaws.com/"}
INTERVAL=${2:-5}

while true; do
    sleep $INTERVAL
    status_web=`curl -s -o /dev/null -w '%{http_code} OK' $URL`
    echo "[STATUS] Web microservice: $status_web"
    sleep 0.3
    status_stats=`curl -s -o /dev/null -w '%{http_code} OK' $URL'stats-service/entries'`
    echo "[STATUS] Stats microservice: $status_stats"
    sleep 0.3
    status_users=`curl -s -o /dev/null -w '%{http_code} OK' $URL'users-service/users'`
    echo "[STATUS] Users microservice: $status_users"
done
