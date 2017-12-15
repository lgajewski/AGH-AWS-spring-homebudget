/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WebController {

    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @Value("#{environment['SERVICE_ENDPOINT'] ?: 'localhost:8080'}")
    private String userEndpoint;

    @Value("#{environment['SERVICE_ENDPOINT'] ?: 'localhost:8081'}")
    private String statsEndpoint;

    @RequestMapping("/web/service/user/ip")
    public String user() {
        return userEndpoint;
    }

    @RequestMapping("/web/service/stats/ip")
    public String stats() {
        return statsEndpoint;
    }


}
