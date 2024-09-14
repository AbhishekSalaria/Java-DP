package org.java.dp.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        IFoodDeliveryCreator foodDeliveryCreator = new FoodDeliveryConcreteCreator();
        IFoodDeliveryService swiggy = foodDeliveryCreator.getDeliveryService("swiggy");
        System.out.println(swiggy.getName());
        swiggy.serviceLogic();
        IFoodDeliveryService zomato = foodDeliveryCreator.getDeliveryService("zomato");
        System.out.println(zomato.getName());
        zomato.serviceLogic();
    }
}
