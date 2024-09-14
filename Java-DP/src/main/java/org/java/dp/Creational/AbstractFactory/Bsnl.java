package org.java.dp.Creational.AbstractFactory;

public class Bsnl implements ISimCardProvider{
    private String name;

    public Bsnl(String name) {
        this.name = name;
    }

    @Override
    public String providerName() {
        return name;
    }

    @Override
    public void providerLogic() {
        System.out.println("Inside BSNL provider Logic");
    }
}
