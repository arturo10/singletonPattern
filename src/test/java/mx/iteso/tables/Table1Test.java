package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 22/10/2016.
 */
public class Table1Test {

    TableOrder order1;
    @Before
    public void setUp(){
        order1= Table1.getInstance();
    }

    @Test
    public void addDrinksTest(){
        Drink drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        order1.addDrink(drink);
        assertEquals(1, order1.drinks.size());
    }

    @Test
    public void addDishesTest(){
        Dish dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order1.addDish(dish);
        assertEquals(1, order1.dishes.size());
    }

    @Test
    public void clearDrinksTest(){
        order1.clearDrinks();
        assertEquals(0, order1.drinks.size());
    }

    @Test
    public void clearDishesTest(){
        order1.clearDishes();
        assertEquals(0, order1.dishes.size());
    }

    @Test
    public void printCheckTest() {

        Table1.clearOrder();
        order1=Table1.getInstance();

        Dish dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        order1.addDish(dish);

        Drink drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        order1.addDrink(drink);

        StringBuilder builder = new StringBuilder();
        builder.append("Check for Table 1\n");
        builder.append("Drinks:\n");
        builder.append("Waiter A: " + "Coke" + " " + "10.0" + "\n");
        builder.append("Dishes:\n");
        builder.append("Waiter C" + ": " + "Enchilada" + " " + "8.0" + "\n");
        builder.append("Total: $18.0");
        assertEquals(builder.toString(),order1.printCheck());
        Table1.clearOrder();
    }


}
