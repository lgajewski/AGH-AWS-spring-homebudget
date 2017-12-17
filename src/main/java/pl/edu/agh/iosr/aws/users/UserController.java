package pl.edu.agh.iosr.aws.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.iosr.aws.users.model.User;

@RestController
class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String home() {
        return "Hello. This is users service: /";
    }


    @RequestMapping("/users-service")
    public String homeService() {
        return "Hello. This is users service: /users-service";
    }


    @RequestMapping("/users-service/test/abc")
    public String test() {
        return "Hello. This is test/abc";
    }

    @RequestMapping("/users-service/test/users")
    public ResponseEntity<Iterable<User>> users() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }


}
