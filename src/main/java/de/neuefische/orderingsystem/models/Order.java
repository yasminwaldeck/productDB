package de.neuefische.orderingsystem.models;

import java.util.ArrayList;

public class Order {

    private String id;
    private ArrayList<Product> products;

    public Order(String id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}
