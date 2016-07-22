package com.spring.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Class com.spring.root.MainLauncher.
 * This represents TODO.
 *
 * @author derradjil
 * @version $$Revision$$
 * @see <script>links('$$HeadURL$$');</script>
 */


@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class MainLauncher {


    public static void main(String[] args) throws Exception {
        //Il y a une authentification par défault
        // user : user
        // password : voir le password aleatoire dans les logs de spring boot
        //a la ligne Using default security password: 5c801b69-91e0-4174-8d3f-6658e262e4dd
        //Pour desactiver l'authentification par default
        //utiliser @EnableGlobalMethodSecurity
        //Voir https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-security.html

       SpringApplication.run(MainLauncher.class, args);


    }
}