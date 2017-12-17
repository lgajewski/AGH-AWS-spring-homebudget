package pl.edu.agh.iosr.aws.users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    @RequestMapping("/")
    public String home() {
        return "Hello. This is users service: /";
    }


    @RequestMapping("/users-service")
    public String homeService() {
        return "Hello. This is users service: /users-service";
    }

}
