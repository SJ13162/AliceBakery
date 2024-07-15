package com.simran.learning.alicebakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CakeBake

    @Autowired
    Frosting frosting;

    @Autowired
    Syrup syrup;

    public void bakeCake() {
        System.out.println("Bake a cake");
        System.out.println(frosting.getFrostingType());
        System.out.println(syrup.getSyrupType());
    }
}
