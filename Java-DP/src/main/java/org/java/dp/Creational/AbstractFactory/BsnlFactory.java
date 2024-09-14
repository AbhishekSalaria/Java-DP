package org.java.dp.Creational.AbstractFactory;

public class BsnlFactory implements ISimCardAbstractFactory{
    private String name;

    public BsnlFactory(String name) {
        this.name = name;
    }

    @Override
    public ISimCardProvider createSim() {
        return new Bsnl(name);
    }
}
