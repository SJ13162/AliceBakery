package com.simran.learning.alicebakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "bakery.syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{

    @Override
    public String getSyrupType() {
        System.out.println("Strawberry getSyrupType");
        return "Strawberry syrup";
    }
}
