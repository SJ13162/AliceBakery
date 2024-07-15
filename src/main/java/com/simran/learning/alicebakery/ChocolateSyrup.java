package com.simran.learning.alicebakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "bakery.syrup", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

    @Override
    public String getSyrupType() {
        System.out.println("Chocolate getSyrupType");
        return "Chocolate syrup";
    }
}
