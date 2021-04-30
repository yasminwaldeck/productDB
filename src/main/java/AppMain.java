import de.neuefische.orderingsystem.db.ProductDb;
import de.neuefische.orderingsystem.models.Order;
import de.neuefische.orderingsystem.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        /*
        //list products
        ProductDb productdb = new ProductDb();
        System.out.println(productdb.list());
        System.out.println(productdb.toString());
*/
        //order products
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

    }
}
