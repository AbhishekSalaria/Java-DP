package org.java.dp.Creational.Prototype;

public class NeemTree extends Tree{
    private String height;
    private String mass;
    private String expectedLifeSpan;

    public NeemTree(String height, String mass, String expectedLifeSpan) {
        this.height = height;
        this.mass = mass;
        this.expectedLifeSpan = expectedLifeSpan;
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

    public String getExpectedLifeSpan() {
        return expectedLifeSpan;
    }

    public void setExpectedLifeSpan(String expectedLifeSpan) {
        this.expectedLifeSpan = expectedLifeSpan;
    }

    @Override
    public Object copy() {
        return new NeemTree(height,mass,expectedLifeSpan);
    }
}
