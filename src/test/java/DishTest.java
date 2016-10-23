import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 22/10/2016.
 */
public class DishTest {
    Dish dish;
    @Before
    public void setUp(){
        dish=new Dish();
    }

    @Test
    public void PriceTest() {
        dish.setPrice(8);
        assertEquals(8.0, dish.getPrice(),0);
    }
    @Test
    public void setDescriptionTest() {
        dish.setDescription("Enchilada con Pollo");
        assertEquals("Enchilada con Pollo", dish.getDescription());
    }
    @Test
    public void setNameTest() {
        dish.setName("Enchilada");
        assertEquals("Enchilada", dish.getName());
    }

    @Test
    public void setWaiterTest() {

        dish.setWaiter("Waiter C");
        assertEquals("Waiter C", dish.getWaiter());
    }
}
