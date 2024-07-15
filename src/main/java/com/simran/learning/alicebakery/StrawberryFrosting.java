package com.simran.learning.alicebakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "bakery.frosting", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        System.out.println("Strawberry getFrostingType");
        return "Strawberry frosting";
    }
}
