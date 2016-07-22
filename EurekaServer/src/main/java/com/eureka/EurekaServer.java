package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableEurekaServer
*/

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "registration-server");
        SpringApplication.run(EurekaServer.class, args);
    }
}


/*
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {


    public static void main(String[] args) {
        // Tell server to look for registration.properties or registration.yml
        System.setProperty("spring.config.name", "registration-server");

        SpringApplication.run(EurekaServer.class, args);
    }
}
*/