import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 22/10/2016.
 */
public class DrinkTest {
    Drink drink;
    @Before
    public void setUp(){
        drink=new Drink();
    }

    @Test
    public void PriceTest() {
        drink.setPrice(19);
        assertEquals(19.0, drink.getPrice(),0);
    }
    @Test
    public void setDescriptionTest() {
        drink.setDescription("Coca");
        assertEquals("Coca", drink.getDescription());
    }
    @Test
    public void setNameTest() {
        drink.setName("Coca");
        assertEquals("Coca", drink.getName());
    }

    @Test
    public void setWaiterTest() {

        drink.setWaiter("Waiter A");
        assertEquals("Waiter A", drink.getWaiter());
    }


}
