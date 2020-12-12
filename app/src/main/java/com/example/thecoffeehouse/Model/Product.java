package com.example.thecoffeehouse.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
    private String name;
    private String description;
    private String price;
    private String category;
    private int img;

    public Product(String name, String description, String price, int img) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
