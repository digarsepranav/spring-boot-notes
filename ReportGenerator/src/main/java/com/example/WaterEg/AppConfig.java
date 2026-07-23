package com.example.WaterEg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public WaterBottle waterBottle() {
        return new WaterBottle(500);
    }
}
