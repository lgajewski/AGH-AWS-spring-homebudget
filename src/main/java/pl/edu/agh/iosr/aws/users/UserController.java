package pl.edu.agh.iosr.aws.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/")
    public String home() {
        return "Hello. This is users service: /";
    }


    @RequestMapping("/users-service")
    public String homeService() {
        logger.info("Hello. This is users service: /users-service");
        return "Hello. This is users service: /users-service";
    }

}
