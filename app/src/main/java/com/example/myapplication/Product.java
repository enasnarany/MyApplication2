package com.example.myapplication;

import android.util.Size;

import java.io.Serializable;

enum ProductCategory
{
    lipsticks, creams, makeup
}

public class Product implements Serializable {
    private String Description;
    private String name;
    private String photo;
    private String size;
    private String color;
    private String price;
    private String type;
    private String description;


    public Product(String name, String photo, String size, String color, String price, String type, String description) {
    }

    public Product(String description, String name, String photo, String size, String color, String price, String type, String description1, String appearance) {
        this.Description = description;
        this.name = name;
        this.photo = photo;
        this.size = size;
        this.color = color;
        this.price = price;
        this.type = type;
        this.description = description1;

    }

    public int getprice() {
        return 0;
    }

    public int getcolor() {
        return 0;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Description='" + Description + '\'' +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

