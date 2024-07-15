package com.simran.learning.alicebakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "bakery.frosting", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {

    @Override
    public String getFrostingType() {
        System.out.println("Chocolate getFrostingType");
        return "Chocolate frosting";
    }
}
