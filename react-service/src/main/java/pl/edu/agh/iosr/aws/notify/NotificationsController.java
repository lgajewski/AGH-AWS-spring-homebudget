package pl.edu.agh.iosr.aws.notify;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notify")
class NotificationsController {

    @RequestMapping("/")
    public String home() {
        return "Hello. This is notifications service";
    }

    @RequestMapping("/api")
    public String api() {
        return "Hello. This is notifications api";
    }

}
