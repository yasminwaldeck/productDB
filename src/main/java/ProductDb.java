import java.security.ProtectionDomain;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDb {

    private final Map<String, Product> mapOfProducts = new HashMap<>();


    public ProductDb(){
        Product banana = new Product("42", "banana");
        Product strawberry = new Product("43", "strawberry");
        Product apple = new Product("17", "apple");
        Product papaya = new Product("12", "papaya");
        Product kiwi = new Product("13", "kiwi");
        Product mango = new Product("6", "mango");
        Product coconut = new Product("33", "coconut");
        Product orange = new Product("7", "orange");
        Product watermelon = new Product("10", "watermelon");

        mapOfProducts.put("42", banana);
        mapOfProducts.put("43", strawberry);
        mapOfProducts.put("12", papaya);
        mapOfProducts.put("7", orange);
        mapOfProducts.put("10", watermelon);
        mapOfProducts.put("17", apple);
        mapOfProducts.put("6", mango);
        mapOfProducts.put("33", coconut);
        mapOfProducts.put("13", kiwi);

    }
    /*
    public ProductDb(Collection<Product> products){
        for(Product product: products){
            this.mapOfProducts.put(product.getId(), product);
        }
    }
    */


    public List<Product> list() {
        return List.copyOf(this.mapOfProducts.values());
    }

    public Product get(String keyId){
        return mapOfProducts.get(keyId);
    }

    @Override
    public String toString() {
        return "Products in DB: " + mapOfProducts ;
    }
}
