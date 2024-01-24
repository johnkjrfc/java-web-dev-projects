package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdate;
//Get
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


}
