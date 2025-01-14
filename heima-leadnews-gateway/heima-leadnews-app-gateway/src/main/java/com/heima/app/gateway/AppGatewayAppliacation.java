package com.heima.app.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppGatewayAppliacation {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(AppGatewayAppliacation.class, args);
    }
}
