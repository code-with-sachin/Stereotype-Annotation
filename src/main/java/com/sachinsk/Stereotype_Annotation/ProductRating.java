package com.sachinsk.Stereotype_Annotation;

public class ProductRating {
    private String productName;
    private int rating;
    private Long productId;

    public ProductRating(String productName, int rating, Long productId) {
        this.productName = productName;
        this.rating = rating;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ProductRating{" +
                "productName='" + productName + '\'' +
                ", rating=" + rating +
                ", productId=" + productId +
                '}';
    }
}
