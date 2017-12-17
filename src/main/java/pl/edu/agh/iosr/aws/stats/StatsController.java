/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */
package pl.edu.agh.iosr.aws.stats;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class StatsController {

    @RequestMapping("/")
    public String home() {
        return "Hello. This is stats service: /";
    }


    @RequestMapping("/stats-service")
    public String homeService() {
        return "Hello. This is stats service: /stats-service";
    }
}
