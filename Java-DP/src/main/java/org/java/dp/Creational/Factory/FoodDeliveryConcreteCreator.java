package org.java.dp.Creational.Factory;

public class FoodDeliveryConcreteCreator implements IFoodDeliveryCreator {
    @Override
    public IFoodDeliveryService getDeliveryService(String name) {
        if ("SWIGGY".equalsIgnoreCase(name)) {
            return new Swiggy("Swiggy");
        } else if ("ZOMATO".equalsIgnoreCase(name)) {
            return new Zomato("Zomato");
        }
        return null;
    }
}
