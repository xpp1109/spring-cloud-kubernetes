package org.pipi.sck.c2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class C2Application {
    public static void main(String[] args) {
        SpringApplication.run(C2Application.class, args);
    }
}
