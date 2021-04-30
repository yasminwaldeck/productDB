package de.neuefische.orderingsystem.db;

import de.neuefische.orderingsystem.models.Order;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;

public class OrderDb {

    private HashMap<String, Order> mapOfOrders = new HashMap<>();

    public OrderDb(){

    }

    public void add(Order order){
        mapOfOrders.put(order.getId(), order);
    }

    public Order get(String id){
        return mapOfOrders.get(id);
    }

    public List<Order> list() {
        return List.copyOf(this.mapOfOrders.values());
    }

}
