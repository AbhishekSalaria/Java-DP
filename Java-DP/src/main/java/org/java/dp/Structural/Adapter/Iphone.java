package org.java.dp.Structural.Adapter;

public class Iphone {
    private IIphoneCharger iphoneCharger;

    public Iphone(IIphoneCharger iphoneCharger) {
        this.iphoneCharger = iphoneCharger;
    }

    public void charge() {
        iphoneCharger.charge();
        System.out.println("Iphone is being charged.");
    }
}
