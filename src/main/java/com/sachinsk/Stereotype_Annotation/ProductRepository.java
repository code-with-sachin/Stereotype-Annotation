package com.sachinsk.Stereotype_Annotation;

public interface ProductRepository<T> {
    public void save(T t);
    public T findProductRatingById(Long productId);
}
