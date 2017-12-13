/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.stats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class StatsApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StatsApplication.class, args);
    }

}
