package org.java.dp.Creational.AbstractFactory;

public class AirtelFactory implements ISimCardAbstractFactory{
    private String name;

    public AirtelFactory(String name) {
        this.name = name;
    }

    @Override
    public ISimCardProvider createSim() {
        return new Airtel(name);
    }
}
