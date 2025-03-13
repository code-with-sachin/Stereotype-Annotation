package com.sachinsk.Stereotype_Annotation;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRatingRepository implements ProductRepository<ProductRating> {
    //Using an In-memory Map to store the object data
    private Map<Long, ProductRating> repository;

    public ProductRatingRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public void save(ProductRating productRating) {
        repository.put(productRating.getProductId(), productRating);
    }

    @Override
    public ProductRating findProductRatingById(Long productId) {
        return repository.get(productId);
    }
}
