package com.example.bai4_a;

public class Product {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductText() {
        return productText;
    }

    public void setProductText(String productText) {
        this.productText = productText;
    }

    public String getShopText() {
        return shopText;
    }

    public void setShopText(String shopText) {
        this.shopText = shopText;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String productText, shopText, image;

    public Product(int id, String productText, String shopText) {
        this.id = id;
        this.productText = productText;
        this.shopText = shopText;
    }
}
