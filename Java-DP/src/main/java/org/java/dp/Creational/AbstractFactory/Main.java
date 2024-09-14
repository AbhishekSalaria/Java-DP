package org.java.dp.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        ISimCardProvider bsnl =  SimCardFactory.createSim(new BsnlFactory("BSNL"));
        System.out.println(bsnl.providerName());
        bsnl.providerLogic();

        ISimCardProvider airtel =  SimCardFactory.createSim(new AirtelFactory("Airtel"));
        System.out.println(airtel.providerName());
        airtel.providerLogic();
    }
}
