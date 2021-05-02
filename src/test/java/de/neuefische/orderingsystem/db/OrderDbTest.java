package de.neuefische.orderingsystem.db;

import de.neuefische.orderingsystem.models.Fruit;
import de.neuefische.orderingsystem.models.Order;
import de.neuefische.orderingsystem.models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderDbTest {

    @Test
    @DisplayName("Test to get new de.neuefische.orderingsystem.models.Order")
    public void testAddAndGetOrder(){
        //GIVEN
        Product banana = new Fruit("42", "banana");
        Product watermelon = new Fruit("10", "watermelon");

        ArrayList<Product> yummiFruits = new ArrayList<>();
        yummiFruits.add(banana);
        yummiFruits.add(watermelon);

        Order order = new Order("1", yummiFruits);
        OrderDb orderDb = new OrderDb();
        orderDb.add(order);

        //WHEN
        Optional<Order> actual = orderDb.get("1");
        String actualString = String.valueOf(actual);


        String expected = "Optional[Order Number: 1" + "\n" +
        "Products: [Product: banana, ID 42" + "\n" +
                ", Product: watermelon, ID 10"+ "\n" +
                    "]]";

        //THEN
        assertEquals(expected, actualString);
    }
}
