package pl.edu.agh.iosr.aws.stats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StatsApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StatsApplication.class, args);
    }

}
