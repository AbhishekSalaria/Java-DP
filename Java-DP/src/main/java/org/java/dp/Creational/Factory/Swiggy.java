package org.java.dp.Creational.Factory;

public class Swiggy implements IFoodDeliveryService {
    private String name;

    public Swiggy(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void serviceLogic() {
        System.out.println("Welcome to Swiggy Service Logic.");
    }
}
