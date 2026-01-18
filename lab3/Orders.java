package lab3;

import java.util.HashMap;
import java.util.Map;

public class Orders {
    private HashMap<Integer, Order> orders;

    public Orders() {
        orders = new HashMap<>();
    }

    public void addOrder(int orderNumber, Order order) {
        orders.put(orderNumber, order);
    }

    public Order getOrder(int orderNumber) {
        return orders.get(orderNumber);
    }

    public void removeOrder(int orderNumber) {
        orders.remove(orderNumber);
    }

    public void displayOrders() {
    for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
        System.out.println("Order number: " + entry.getKey() + ", Details: " + entry.getValue());
    }
}
}