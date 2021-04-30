package de.neuefische.orderingsystem.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    @DisplayName("addOrder should create an order")
    public void testAddAndListOrder() {
        // Given
        ArrayList<String> productsToBeOrdered = new ArrayList<>();
        productsToBeOrdered.add("7");
        productsToBeOrdered.add("10");

        // When
        OrderService orderService = new OrderService();
        orderService.addOrder(productsToBeOrdered);

        String actual = String.valueOf(orderService.listOrders());

        // Then
        String expected = "[Order Number: 1" + "\n" + "Products: [Product: orange, ID 7" + "\n" +
        ", Product: watermelon, ID 10" +"\n"+ "]]";
        assertEquals(expected, actual);

    }
}
