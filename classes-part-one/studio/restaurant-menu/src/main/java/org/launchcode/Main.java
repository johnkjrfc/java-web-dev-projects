package org.launchcode;

import java.time.LocalDate;

public class Main {
    Menu menu = new Menu();
    public static void main(String[] args) {
        LocalDate todaysDate = LocalDate.now();
	// write your code here
        MenuItem item1 = new MenuItem("Grilled Cheese", "Mains", 15.99, "cheese in between bread, grilled", todaysDate);
        MenuItem item2 = new MenuItem("BLT", "Mains", 12.39, "Bacon, Tomato, Lettuce and mayo, on cibatta", todaysDate);
        MenuItem item3 = new MenuItem("Toasted Ravs", "Appetizers", 13.59, "served with marinara sauce", todaysDate);
        MenuItem item4 = new MenuItem("Ice Cream", "Desserts", 6.39, "Cream, that is frozen", todaysDate);


    }
}
