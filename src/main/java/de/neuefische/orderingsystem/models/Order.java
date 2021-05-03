package de.neuefische.orderingsystem.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private String id;
    private List<Product> products;

    public Order(String id, ArrayList<Product> products) {
        this.id = id;
        this.products = Collections.unmodifiableList(products);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order Number: " + id + '\n' +
                "Products:\n" + products;
    }
}
