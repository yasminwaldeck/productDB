import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderDbTest {

    @Test
    @DisplayName("Test to get new Order")
    public void testAddAndGetOrder(){
        //GIVEN
        Product banana = new Product("42", "banana");
        Product watermelon = new Product("10", "watermelon");

        ArrayList<Product> yummiFruits = new ArrayList<>();
        yummiFruits.add(banana);
        yummiFruits.add(watermelon);

        Order order = new Order("1", yummiFruits);
        OrderDb orderDb = new OrderDb();
        orderDb.add(order);

        //WHEN
        Order actual = orderDb.get("1");

        //THEN
        assertEquals(actual, order);
    }
}
