package Dzien9.Task9;

public class Main {
    public static void main(String[] args) {
        OrderItem sugar = new OrderItem("Cukier", 3, 4);
//        sugar.print();
        OrderItem milk = new OrderItem("Mleko", 5, 3);
//        milk.print();
//        OrderItem fakeProduct = new OrderItem("Cos", 5, 3);
//        boolean result = fakeProduct.isCorrect();
//        System.out.println(result);
        OrderItem orderItem3 = new OrderItem("Jajka", 12, 0.5);
        OrderItem orderItem4 = new OrderItem("Chleb", 2, 4.5);
        OrderItem orderItem5 = new OrderItem("Woda", 6, 10);

        Order order = new Order(4);
        order.addItem(sugar);
        order.addItem(milk);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
//        order.addItem(orderItem5);
        order.printOrder(order);

    }
}
