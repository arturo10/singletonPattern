package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.tables.Table2;
import mx.iteso.singleton.tables.Table3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 22/10/2016.
 */
public class Table3Test {

    TableOrder order3;
    @Before
    public void setUp(){
        order3= Table3.getInstance();
    }

    @Test
    public void addDrinksTest(){
        Drink drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        order3.addDrink(drink);
        assertEquals(1, order3.drinks.size());
    }

    @Test
    public void addDishesTest(){
        Dish dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order3.addDish(dish);
        assertEquals(1, order3.dishes.size());
    }

    @Test
    public void clearDrinksTest(){
        order3.clearDrinks();
        assertEquals(0, order3.drinks.size());
    }

    @Test
    public void clearDishesTest(){
        order3.clearDishes();
        assertEquals(0, order3.dishes.size());
    }

    @Test
    public void printCheckTest() {

        Table3.clearOrder();
        order3=Table3.getInstance();

        Dish dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order3.addDish(dish);

        Drink drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        order3.addDrink(drink);

        StringBuilder builder = new StringBuilder();
        builder.append("Check for Table 3\n");
        builder.append("Drinks:\n");
        builder.append("Waiter A: " + "Coke" + " " + "10.0" + "\n");
        builder.append("Dishes:\n");
        builder.append("Waiter C" + ": " + "Enchilada" + " " + "8.0" + "\n");
        builder.append("Total: $18.0");
        assertEquals(builder.toString(),order3.printCheck());
        Table3.clearOrder();
    }

}
