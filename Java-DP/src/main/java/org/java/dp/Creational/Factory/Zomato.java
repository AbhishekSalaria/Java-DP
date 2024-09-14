package org.java.dp.Creational.Factory;

public class Zomato implements IFoodDeliveryService {
    private String name;

    public Zomato(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void serviceLogic() {
        System.out.println("Welcome to Zomato Service Logic");
    }
}
