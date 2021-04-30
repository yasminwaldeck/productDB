import java.util.List;

public class OrderService {

    OrderDb orderDb = new OrderDb();

    public OrderService(){
    }

    public void addOrder(Order order){
        orderDb.add(order);
    }

    public List<Order> listOrders(){
        return orderDb.list();
    }


}
