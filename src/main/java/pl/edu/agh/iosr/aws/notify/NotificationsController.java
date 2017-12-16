package pl.edu.agh.iosr.aws.notify;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notify")
class NotificationsController {

    private static final Logger logger = LoggerFactory.getLogger(pl.edu.agh.iosr.aws.notify.NotificationsController.class);

    @Value("#{environment['SERVICE_ENDPOINT'] ?: 'localhost:8080'}")
    private String userEndpoint;

    @Value("#{environment['SERVICE_ENDPOINT'] ?: 'localhost:8081'}")
    private String statsEndpoint;

    @RequestMapping("/web/service/user/ip")
    public String user() {
        return userEndpoint;
    }

    @RequestMapping("/web/service/stats/ip")
    public String stats() {
        return statsEndpoint;
    }


    @RequestMapping("/")
    public String home() {
        return "Hello. This is notifications service";
    }

    @RequestMapping("/api")
    public String api() {
        return "Hello. This is notifications api";
    }

}
