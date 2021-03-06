package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.tables.Table2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 22/10/2016.
 */
public class Table2Test {

    TableOrder order2;
    @Before
    public void setUp(){
        order2= Table2.getInstance();
    }

    @Test
    public void addDrinksTest(){
        Drink drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        order2.addDrink(drink);
        assertEquals(1, order2.drinks.size());
    }

    @Test
    public void addDishesTest(){
        Dish dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order2.addDish(dish);
        assertEquals(1, order2.dishes.size());
    }

    @Test
    public void clearDrinksTest(){
        order2.clearDrinks();
        assertEquals(0, order2.drinks.size());
    }

    @Test
    public void clearDishesTest(){
        order2.clearDishes();
        assertEquals(0, order2.dishes.size());
    }

    @Test
    public void printCheckTest() {

        Table2.clearOrder();
        order2=Table2.getInstance();

        Dish dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order2.addDish(dish);

        Drink drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        order2.addDrink(drink);

        StringBuilder builder = new StringBuilder();
        builder.append("Check for Table 2\n");
        builder.append("Drinks:\n");
        builder.append("Waiter A: " + "Coke" + " " + "10.0" + "\n");
        builder.append("Dishes:\n");
        builder.append("Waiter C" + ": " + "Enchilada" + " " + "8.0" + "\n");
        builder.append("Total: $18.0");
        assertEquals(builder.toString(),order2.printCheck());
        Table2.clearOrder();
    }

}
