package pl.edu.agh.iosr.aws.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StatsApplication {

    @Autowired
    StatsRepository statsRepository;

    private static final Logger logger = LoggerFactory.getLogger(StatsApplication.class);


    @PostConstruct
    public void post() {
        logger.info("Trying to list statistics..");
        logger.info("Statistics: " + statsRepository.findAll());
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(StatsApplication.class, args);
    }

}
