/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
