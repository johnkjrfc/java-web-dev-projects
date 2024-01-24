package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    private LocalDate dateAdded;

    public MenuItem(double p, String d, String c, boolean isNew, LocalDate dateAdded) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = isNew;
        this.dateAdded = LocalDate.now();


    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

