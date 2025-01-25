package com.tit.week02.day05.multilevelinheritance.onlineretailordermanagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("O12345", "2025-01-24", "TN987654", "2025-01-27");
        order.displayInfo();
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
