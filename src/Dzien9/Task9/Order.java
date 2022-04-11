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

    public void printOrder (Order orders){
       for (int i = 0; i < orders.maxOrderItem; i++){
           orderItems[i].print();
       }
    }

    public double getTotalAmount (){
       int totalAmount = 0;
       for (int i = 0; i < maxOrderItem; i++){
           totalAmount += orderItems[i].getAmount();
       }
       return totalAmount;
    }

    public double getTotalCount (){
       int totalCount = 0;
       for (int i = 0; i < maxOrderItem; i++){
           totalCount += orderItems[i].getQuntity();
       }
       return totalCount;
    }


}
