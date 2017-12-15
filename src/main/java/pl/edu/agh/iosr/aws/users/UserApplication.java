package pl.edu.agh.iosr.aws.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserApplication.class, args);
    }

}
