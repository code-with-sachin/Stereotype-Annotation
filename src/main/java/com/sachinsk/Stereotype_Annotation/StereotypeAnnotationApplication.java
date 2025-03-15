package com.sachinsk.Stereotype_Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class StereotypeAnnotationApplication {

	public static void main(String[] args) {
		//To print all the beans present inside your spring boot application
		ConfigurableApplicationContext applicationContext = SpringApplication.run(StereotypeAnnotationApplication.class, args);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.stream(beanDefinitionNames).sorted().forEach(System.out::println);

//		SpringApplication.run(StereotypeAnnotationApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.sachinsk.Stereotype_Annotation");
		context.refresh();

		//Getting the Bean from the component class
//		ProductRatingComponent productRatingComponent =
//				context.getBean(ProductRatingComponent.class);
//		productRatingComponent.ratingFunction();

//		ProductRatingService productRatingService = context.getBean(ProductRatingService.class);
//		productRatingService.ratingService(4);
//		productRatingService.ratingService(-3);

		//Getting bean from Repository
		ProductRatingRepository repository = context.getBean(ProductRatingRepository.class);

		repository.save(new ProductRating("Dell Laptop", 4, 1L));
		repository.save(new ProductRating("ACER Laptop", 3, 2L));

		//fetching
		ProductRating productRating = repository.findProductRatingById(1L);
		System.out.println(productRating);
		System.out.println("Product Id is : " + productRating.getProductId());
		System.out.println("Product Name is : " + productRating.getProductName());
		System.out.println("Product Rating is : " + productRating.getRating());

		context.close();
	}

}
