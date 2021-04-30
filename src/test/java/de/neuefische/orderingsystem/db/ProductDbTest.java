package de.neuefische.orderingsystem.db;

import de.neuefische.orderingsystem.db.ProductDb;
import de.neuefische.orderingsystem.models.Obst;
import de.neuefische.orderingsystem.models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.rmi.NoSuchObjectException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductDbTest {

    @Test
    @DisplayName("Test get right product")
    public void testGetProductDb() throws NoSuchObjectException {
        //Given
        ProductDb productDb = new ProductDb();
        Product banana = new Obst("42", "banana");
        Product expected = new Obst("42", "banana");
        String keyID = "42";

        //When
        Product actual = productDb.get("42");

        //Then
        assertEquals(expected, actual);
    }

}
