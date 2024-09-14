package org.java.dp.Creational.Prototype;

public class PineTree extends Tree{
    private String height;
    private String mass;

    public PineTree(String height, String mass) {
        this.height = height;
        this.mass = mass;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    @Override
    public Object copy() {
        return new PineTree(height, mass);
    }
}
