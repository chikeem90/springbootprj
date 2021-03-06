package io.chikeem90.springinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    private String hello;

    @Autowired
    private DoyeonProperties properties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("===============");
        logger.debug(hello);
        logger.debug(properties.getName());
        logger.debug(properties.getFullName());
        logger.debug("===============");
    }
}
