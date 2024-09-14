package org.java.dp.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(new IphoneCharger());
        Android android = new Android(new AndroidCharger());

        iphone.charge();
        System.out.println();
        android.charge();
        System.out.println();

        IIphoneCharger iphoneCharger = new IphoneAdapter(new AndroidCharger());
        Iphone iphoneX = new Iphone(iphoneCharger);

        iphoneX.charge();

    }
}
