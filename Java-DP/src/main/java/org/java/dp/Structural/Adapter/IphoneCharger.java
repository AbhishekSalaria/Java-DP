package org.java.dp.Structural.Adapter;

public class IphoneCharger implements IIphoneCharger{
    @Override
    public void charge() {
        System.out.println("Iphone charger is being used.");
    }
}
