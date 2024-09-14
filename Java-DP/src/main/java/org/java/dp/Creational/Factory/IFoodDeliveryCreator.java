package org.java.dp.Creational.Factory;

public interface IFoodDeliveryCreator {
    public IFoodDeliveryService getDeliveryService(String name);
}
