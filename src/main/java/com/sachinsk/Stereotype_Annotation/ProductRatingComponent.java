package com.sachinsk.Stereotype_Annotation;

import org.springframework.stereotype.Component;

@Component
public class ProductRatingComponent {

    public void ratingFunction() {
        System.out.println("5 Star rating is on Top scale, 1 star means poor rating");
    }
}
