/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */
package pl.edu.agh.iosr.aws.user.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller used to showcase what happens when an exception is thrown
 *
 * @author Michael Isvy
 * <p/>
 * Also see how a view that resolves to "error" has been added ("error.html").
 */
@RestController
class CrashController {

    @RequestMapping(value = "/oups", method = RequestMethod.GET)
    public String triggerException() {
        throw new RuntimeException(
                "Expected: controller used to showcase what " + "happens when an exception is thrown");
    }

}
