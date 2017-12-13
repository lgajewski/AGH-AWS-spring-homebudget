/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class SystemApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SystemApplication.class, args);
    }

}
