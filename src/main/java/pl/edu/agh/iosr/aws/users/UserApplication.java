package pl.edu.agh.iosr.aws.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class UserApplication {

    @Autowired
    UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @PostConstruct
    public void post() {
        logger.info("Trying to list users..");
        logger.info("Users: " + userRepository.findAll());
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserApplication.class, args);
    }
}
