package com.sachinsk.Stereotype_Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StereotypeAnnotationApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StereotypeAnnotationApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.sachinsk.Stereotype_Annotation");
		context.refresh();

		//Getting the Bean from the component class
//		ProductRatingComponent productRatingComponent =
//				context.getBean(ProductRatingComponent.class);
//		productRatingComponent.ratingFunction();
		ProductRatingService productRatingService = context.getBean(ProductRatingService.class);
		productRatingService.ratingService(4);
		productRatingService.ratingService(-3);
		context.close();
	}

}
