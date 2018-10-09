/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.zuul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VndErrorController implements ErrorController {

    @Value("${error.path:/error}")
    private String errorPath;

    @Override
    public String getErrorPath() {
        return errorPath;
    }

    @RequestMapping(value = "${error.path:/error}")
    public String error() {
        return "error";
    }
}
