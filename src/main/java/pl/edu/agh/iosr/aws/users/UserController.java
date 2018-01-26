package pl.edu.agh.iosr.aws.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping("/http/{statusCode}")
    public ResponseEntity<String> http(@PathVariable("statusCode") String statusCodeParam) {
        int statusCode = Integer.valueOf(statusCodeParam);
        return new ResponseEntity<>("Responding with: " + statusCode, HttpStatus.valueOf(statusCode));
    }

    @RequestMapping(path = "/log/warn", method = RequestMethod.POST)
    public ResponseEntity<String> logWarn() {
        String logLevel = "warn";
        logger.warn("Example log message with " + logLevel + " level.");
        return ResponseEntity.ok("Logged into application with log level: " + logLevel);
    }

    @RequestMapping(path = "/log/info", method = RequestMethod.POST)
    public ResponseEntity<String> logInfo() {
        String logLevel = "info";
        logger.info("Example log message with " + logLevel + " level.");
        return ResponseEntity.ok("Logged into application with log level: " + logLevel);
    }

    @RequestMapping(path = "/log/error", method = RequestMethod.POST)
    public ResponseEntity<String> logError() {
        String logLevel = "error";
        logger.error("Example log message with " + logLevel + " level.");
        return ResponseEntity.ok("Logged into application with log level: " + logLevel);
    }
}
