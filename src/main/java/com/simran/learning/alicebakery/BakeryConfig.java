package com.simran.learning.alicebakery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BakeryConfig {

    @Bean
    public CakeBaker customCakeBaker() {
        return new CakeBaker();
    }
}
