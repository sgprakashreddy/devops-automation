package com.javatechie;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DevopsIntegrationApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(DevopsIntegrationApplication.class);

    @Test
    public void contextLoads() {
        logger.info("******** Test cases are executing  ******");
        logger.info("******** ******");
    }

}
