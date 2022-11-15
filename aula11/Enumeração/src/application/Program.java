package src.application;

import java.util.Date;

import src.entities.Order;
import src.entities_enums.OrderStatus;

public class Program {
    public static void main(String[] args) {

        // Objeto Order
        Order order = new Order(1080,new Date(), OrderStatus.DEVILERED);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSING;
        OrderStatus os2 = OrderStatus.valueOf("PROCESSING");

        System.out.println(os1);
        System.out.println(os2);
    }
}
