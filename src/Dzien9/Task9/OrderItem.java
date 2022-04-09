package Dzien9.Task9;

import Dzien8.StringHelper;

public class OrderItem {
    private static final String SEPARATOR = "\t|\t";
    private String productName;
    private int quntity;
    private double price;

    public OrderItem(String productName, int quntity, double price) {
        this.productName = productName;
        this.quntity = quntity;
        this.price = price;
    }

    public double getAmount () {
        return quntity * price;
    }

    public boolean isCorrect() {
        return StringHelper.isValid(productName)    && quntity > 0 && price > 0;
    }

    public void print (){
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append(SEPARATOR);
        sb.append(price).append(" zł").append(SEPARATOR);
        sb.append(quntity).append(" pcs").append(SEPARATOR);
        sb.append(getAmount()).append(" zł").append(SEPARATOR);
        System.out.println(sb);
    }


}
