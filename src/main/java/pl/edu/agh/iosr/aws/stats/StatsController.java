/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */
package pl.edu.agh.iosr.aws.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class StatsController {

    @Value("#{environment['SERVICE_ENDPOINT'] ?: 'localhost:8080'}")
    private String serviceEndpoint;


    private static final Logger logger = LoggerFactory.getLogger(StatsController.class);

    @RequestMapping("/")
    public String home() {
        return "Hello. This is stats service";
    }
}
