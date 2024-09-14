package org.java.dp.Structural.Adapter;

public class Android {
    private IAndroidCharger androidCharger;

    public Android(IAndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    public void charge() {
        androidCharger.charge();
        System.out.println("Android is being charged.");
    }
}
