package de.neuefische.orderingsystem.db;

import de.neuefische.orderingsystem.models.Fruit;
import de.neuefische.orderingsystem.models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.rmi.NoSuchObjectException;

import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import static org.hamcrest.MatcherAssert.assertThat;


public class ProductDbTest {

    @Test
    @DisplayName("Test get right product")
    public void testGetProductDb() throws NoSuchObjectException {
        //Given
        ProductDb productDb = new ProductDb();
        Product banana = new Fruit("42", "banana");
        Product expected = new Fruit("42", "banana");
        String keyID = "42";

        //When
        Product actual = productDb.get("42");

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetException(){

        ProductDb productDb = new ProductDb();

        try{
            Product actual = productDb.get("66");
            fail();
        } catch (Exception exception){
            assertThat(exception.getClass(), is(NoSuchObjectException.class));
        }

    }

}
