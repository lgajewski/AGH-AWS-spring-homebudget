package pl.edu.agh.iosr.aws.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;


@RestController
class UserController {

    @Value("#{environment['SERVICE_ENDPOINT'] ?: 'localhost:8080'}")
    private String serviceEndpoint;

    @Inject
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

}
