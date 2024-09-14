package org.java.dp.Structural.Adapter;

public class AndroidCharger implements IAndroidCharger{
    @Override
    public void charge() {
        System.out.println("Android charger is being used.");
    }
}
