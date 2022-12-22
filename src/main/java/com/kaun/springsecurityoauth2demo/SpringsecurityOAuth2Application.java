package com.kaun.springsecurityoauth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *  http://localhost:8080/oauth/authorize?response_type=code&client_id=admin&redirect_url=http://www.google.com&scope=all
 */

@SpringBootApplication
public class SpringsecurityOAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityOAuth2Application.class, args);
    }

}
