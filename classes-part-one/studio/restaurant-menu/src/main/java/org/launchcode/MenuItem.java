package org.launchcode;

import java.time.LocalDate;
import java.util.Date;

//Date;
public class MenuItem {
    //Declare fields
    private String item;
    private String Category;
    private double price;
    private String description;
    private final LocalDate dateAdded;


    public MenuItem(String item, String category, double price, String description, LocalDate dateAdded) {
        this.item = item;
        this.Category = category;
        this.price = price;
        this.description = description;
        this.dateAdded = LocalDate.now();

    }



    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

}
