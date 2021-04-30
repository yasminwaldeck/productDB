import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductDbTest {

    @Test
    @DisplayName("Test get right product")
    public void testGetProductDb() {
        //Given
        ProductDb productDb = new ProductDb();
        Product banana = new Product("42", "banana");
        Product expected = new Product("42", "banana");
        String keyID = "42";

        //When
        Product actual = productDb.get("42");

        //Then
        assertEquals(expected, actual);
    }

}
