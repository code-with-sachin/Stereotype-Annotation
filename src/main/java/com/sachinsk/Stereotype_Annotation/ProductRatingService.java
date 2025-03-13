package com.sachinsk.Stereotype_Annotation;

import org.springframework.stereotype.Service;

@Service
public class ProductRatingService {
    public void ratingService(int rating) {
        if (rating>0 && rating<=5){
            System.out.println("Valid rating is : " +rating);
            return;
        }
        System.out.println("Invalid Rating provided");
    }
}
