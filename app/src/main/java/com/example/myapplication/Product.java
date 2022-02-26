package com.example.myapplication;
enum ProductCategory
{
    lipsticks, creams, makeup
}

public class Product {
    private String Description;
    private String name;
    private String photo;
    private String size;
    private String color;
    private String price;
    private String type;
    private String description;
    private String Price;

    private String appearance;

    public Product(String name, String photo, String size, String appearance,String type,String description,String price)
    {
        this.name = name;
        this.photo = photo;
        this.size = size;
        this.color= color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color= color;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    private void gettype(String type){this.type = type;}

    private void getDescription(String description){this.description = description;}

    private void setDescription(String description){this.description=description}


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
