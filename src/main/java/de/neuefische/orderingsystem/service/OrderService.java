package de.neuefische.orderingsystem.service;

import de.neuefische.orderingsystem.db.OrderDb;
import de.neuefische.orderingsystem.db.ProductDb;
import de.neuefische.orderingsystem.models.Order;
import de.neuefische.orderingsystem.models.Product;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderService {

    ProductDb productDb = new ProductDb();
    OrderDb orderDb = new OrderDb();
    int size = 1;

    public OrderService() {
    }

    public void addOrder(List<String> ids) {
        ArrayList<Product> products = new ArrayList<>();
        boolean allProductsAvailable = true;

        for (String id : ids) {
           try {
               products.add(productDb.get(id));

            } catch (NoSuchObjectException e) {
               System.out.println(e);
               allProductsAvailable = false;
            }
        }

        if(allProductsAvailable){

        String orderId = String.valueOf(size);
        Order order = new Order(orderId, products);
        size++;
        orderDb.add(order);

        }

    }


    public List<Order> listOrders() {
        return orderDb.list();
    }


    @Override
    public String toString() {
        return orderDb.toString();
    }

}

