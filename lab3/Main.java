package lab3;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        myHashT<Integer, String> table = new myHashT<>();

        table.put(1, "Banana");                 // Добавляем банан
        System.out.println(table.get(1));       // Получаем индекс банана
        System.out.println(table.isEmpty(1));   // Проверяем пустой ли банан
        System.out.println(table.size());       // Проверяем размер хешмапы
        System.out.println(table.remove(1));    // Удаляем банан
        System.out.println(table.size());       // Проверяем размер хешмапы


        // Задание 2
        System.out.println("Задание 2\n");
        Orders orders = new Orders();
        Order order1 = new Order("Computer Mouse", "m.Aviamotor, city Moscow", 1499.99);
        Order order2 = new Order("Apple", "m.Sokol, city Moscow", 35);
        Order order3 = new Order("Glue", "Red street, city Moscow", 200);

        orders.addOrder(1, order1);
        orders.addOrder(2, order2);
        orders.addOrder(3, order3);

        orders.displayOrders();
        orders.removeOrder(1);

        System.out.println("Order 1 after removal: " + orders.getOrder(1));

        orders.displayOrders();
    }
}