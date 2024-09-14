package org.java.dp.Creational.AbstractFactory;

public class Airtel implements ISimCardProvider{
    private String name;

    public Airtel(String name) {
        this.name = name;
    }

    @Override
    public String providerName() {
        return name;
    }

    @Override
    public void providerLogic() {
        System.out.println("Inside Airtel provider Logic");
    }
}
