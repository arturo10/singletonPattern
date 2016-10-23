package mx.iteso.singleton;

import java.util.ArrayList;

public abstract class TableOrder {
    public ArrayList dishes;
    public ArrayList drinks;
    public String tableName;

    public void clearDrinks(){
        drinks.clear();
    }

    public void clearDishes(){
        dishes.clear();
    }

    public void addDrink (Drink drink) {
        drinks.add(drink);
    }
    public void addDish (Dish dish) {
        dishes.add(dish);
    }

    public String printCheck(){
        float total = 0;
        Drink dr;
        Dish ds;
        int i;
        StringBuilder builder=new StringBuilder();
        builder.append("Check for " + tableName+ "\n");
        builder.append("Drinks:\n");
        for (i = 0; i < drinks.size(); i++){
            dr = (Drink) drinks.get(i);
            builder.append(dr.getWaiter() + ": " + dr.getName()+ " " + dr.getPrice()+"\n");
            total += dr.getPrice();
        }
        builder.append("Dishes:\n");
        for (i = 0; i < dishes.size(); i++){
            ds = (Dish) dishes.get(i);
            builder.append(ds.getWaiter() + ": " + ds.getName()+ " " + ds.getPrice()+"\n");
            total += ds.getPrice();
        }
        builder.append("Total: $" + total);
        System.out.println(builder.toString());
        return builder.toString();

    }


}

