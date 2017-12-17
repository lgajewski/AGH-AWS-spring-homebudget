package pl.edu.agh.iosr.aws.notify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NotifyApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(pl.edu.agh.iosr.aws.notify.NotifyApplication.class, args);
    }

}
