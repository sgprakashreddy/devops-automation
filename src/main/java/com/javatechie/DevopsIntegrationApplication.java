package com.javatechie;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsIntegrationApplication {

    public static Logger logger= LoggerFactory.getLogger(DevopsIntegrationApplication.class);

    @PostConstruct
    public void init(){
        logger.info("********* DevopsIntegrationApplication Started ********* ");
    }

    public static void main(String[] args) {
        logger.info("********* DevopsIntegrationApplication Executed ********* ");
        logger.info("********* logs are added ********* ");
        SpringApplication.run(DevopsIntegrationApplication.class, args);
    }

}


//echo "# devops-automation" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/sgprakashreddy/devops-automation.git
//        git push -u origin main