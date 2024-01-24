package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    //Menu menu = new Menu();
    public static void main(String[] args) {

        LocalDate todaysDate = LocalDate.now();
        // write your code here
        Menu menu = new Menu(todaysDate, new ArrayList<>());

        MenuItem item1 = new MenuItem(15.99, "Grilled Cheese", "Mains", true, LocalDate.now());
        MenuItem item2 = new MenuItem(12.39, "BLT", "Mains",  true, LocalDate.now());
        MenuItem item3 = new MenuItem(13.59,"Toasted Ravs", "Appetizers",  true, LocalDate.now());
        MenuItem item4 = new MenuItem(6.39,"Ice Cream", "Desserts",  true, LocalDate.now());

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);

        System.out.println(menu);
    }

}
