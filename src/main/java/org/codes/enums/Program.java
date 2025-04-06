package org.codes.enums;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENTS);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.valueOf("SENT");

        System.out.println(os1);
    }
}
