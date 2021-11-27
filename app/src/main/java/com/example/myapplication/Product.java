package com.example.myapplication;
enum ProductCategory
{
    lipsticks, creams, makeup ,
}

public class Product {
    private String name;
    private String photo;
    private String size;
    private Private<color> colors;
    private String appearance;

    public Product(String name, String photo, String size, String appearance)
    {
        this.name = name;
        this.photo = photo;
        this.size = size;
        this.colors = colors;
        this.appearance = appearance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Private<color> getColors() {
        return color;
    }

    public void setColors(Private<color> colors) {
        this.colors= colors;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", size='" + size + '\'' +
                ", colors=" + color +
                ", appearance='" + appearance + '\'' +
                '}';
    }
}
