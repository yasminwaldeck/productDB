package de.neuefische.orderingsystem.db;

import de.neuefische.orderingsystem.models.Order;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OrderDb {

    private HashMap<String, Order> mapOfOrders = new HashMap<>();

    public OrderDb(){

    }

    public void add(Order order){
        mapOfOrders.put(order.getId(), order);
    }

    public Optional<Order> get(String id){
        return Optional.of(mapOfOrders.get(id));
    }

    public List<Order> list() {
        return List.copyOf(this.mapOfOrders.values());
    }

    @Override
    public String toString() {
        return mapOfOrders.toString();
    }
}
