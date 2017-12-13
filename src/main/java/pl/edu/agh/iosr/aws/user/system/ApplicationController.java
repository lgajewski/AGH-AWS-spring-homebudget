/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.user.system;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ApplicationController {

    @RequestMapping("/")
    public String home() {
        return "Welcome to PetClinic, Meow.";
    }

    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

}
