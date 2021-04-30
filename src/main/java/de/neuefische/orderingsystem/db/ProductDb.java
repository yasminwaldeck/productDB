package de.neuefische.orderingsystem.db;

import de.neuefische.orderingsystem.models.Obst;
import de.neuefische.orderingsystem.models.Product;

import java.rmi.NoSuchObjectException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDb {

    private final Map<String, Product> mapOfProducts = new HashMap<>();


    public ProductDb(){
        Product banana = new Obst("42", "banana");
        Product strawberry = new Obst("43", "strawberry");
        Product apple = new Obst("17", "apple");
        Product papaya = new Obst("12", "papaya");
        Product kiwi = new Obst("13", "kiwi");
        Product mango = new Obst("6", "mango");
        Product coconut = new Obst("33", "coconut");
        Product orange = new Obst("7", "orange");
        Product watermelon = new Obst("10", "watermelon");

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
    public de.neuefische.orderingsystem.db.ProductDb(Collection<de.neuefische.orderingsystem.models.Product> products){
        for(de.neuefische.orderingsystem.models.Product product: products){
            this.mapOfProducts.put(product.getId(), product);
        }
    }
    */


    public List<Product> list() {
        return List.copyOf(this.mapOfProducts.values());
    }

    public Product get(String keyId) throws NoSuchObjectException{
        if (!mapOfProducts.containsKey(keyId)){
            throw new NoSuchObjectException("No product with this key");
        }
        return mapOfProducts.get(keyId);
    }

    @Override
    public String toString() {
        return "Products in DB: " + mapOfProducts ;
    }
}
