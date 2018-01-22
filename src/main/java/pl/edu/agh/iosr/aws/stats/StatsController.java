/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */
package pl.edu.agh.iosr.aws.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class StatsController {

    private static final Logger logger = LoggerFactory.getLogger(StatsApplication.class);

    @RequestMapping("/")
    public String home() {
        return "Hello. This is stats service: /";
    }


    @RequestMapping("/stats-service")
    public String homeService() {
        logger.info("Hello. This is stats service: /stats-service");
        return "Hello. This is stats service: /stats-service";
    }
}
