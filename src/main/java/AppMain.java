import de.neuefische.orderingsystem.db.ProductDb;
import de.neuefische.orderingsystem.models.Order;
import de.neuefische.orderingsystem.service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        ProductDb productdb = new ProductDb();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey there.");
        System.out.println("To place an order, type \"order\".");
        System.out.println("To list all orders, type \"list\".");
        System.out.println("To quit, type \"quit\".");

        while(true){
            String s = sc.next();
            if(s.equals("order")) {
                ArrayList<String> productsToBeOrdered = new ArrayList<>();
                System.out.println("Type in the IDs of the products you want to order.");
                System.out.println("To send the order, type \"send\".");
                while(true) {
                    String id = sc.next();
                    if(id.equals("send")) {
                        orderService.addOrder(productsToBeOrdered);
                        System.out.println("To place another order, type \"order\".");
                        System.out.println("To list all orders, type \"list\".");
                        System.out.println("To quit, type \"quit\".");
                        break;
                    }
                    productsToBeOrdered.add(id);
                }
            }
            if(s.equals("list")) System.out.println(orderService.listOrders());
            if(s.equals("quit")) break;
        }
        System.out.println("Goodbye and thanks for all the fish.");
        sc.close();
        /*
        //list products
        ProductDb productdb = new ProductDb();
        System.out.println(productdb.list());
        System.out.println(productdb.toString());
*/
        //order products
        /*
        OrderService orderService = new OrderService();
        ArrayList<String> productsToBeOrdered = new ArrayList<>();
        productsToBeOrdered.add("12");
        productsToBeOrdered.add("42");
        orderService.addOrder(productsToBeOrdered);

        ArrayList<String> productsToBeOrdered2 = new ArrayList<>();
        productsToBeOrdered2.add("17");
        productsToBeOrdered2.add("42");
        productsToBeOrdered2.add("13");
        productsToBeOrdered2.add("94578902");
        orderService.addOrder(productsToBeOrdered2);


        //list orders
        System.out.println(orderService.listOrders());
        */
    }

}
