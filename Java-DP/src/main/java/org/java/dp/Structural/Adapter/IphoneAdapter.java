package org.java.dp.Structural.Adapter;

public class IphoneAdapter implements IIphoneCharger{
    private IAndroidCharger androidCharger;

    public IphoneAdapter(IAndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void charge() {
        androidCharger.charge();
    }
}
