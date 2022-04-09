package Dzien9.Task9;

//rozszerzeać metody do odejmowania i tak dalej
public class Order {
   private int maxOrderItem;
   private OrderItem[] orderItems;
   private int currentItemsInOrder = 0;

   public Order (int maxOrderItem) {
       this.maxOrderItem = maxOrderItem;
       orderItems = new OrderItem[maxOrderItem];
   }

   public boolean addItem(OrderItem orderItem) {
       if(!orderItem.isCorrect()){
           System.out.println("Item is incorrect");
           return false;
       }
       if (currentItemsInOrder >= maxOrderItem){
           System.out.println("Order is full");
           return false;
       }
       orderItems[currentItemsInOrder] = orderItem;
       currentItemsInOrder++;
       return true;
   }



}
