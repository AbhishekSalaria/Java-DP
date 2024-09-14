package org.java.dp.Creational.Singleton;

public final class SingletonSingleTreaded {
    private static SingletonSingleTreaded instance;
    public String value;

    private SingletonSingleTreaded(String value) {
        this.value = value;
    }



    public static SingletonSingleTreaded getInstance(String value) {
        if(instance == null) {
            instance = new SingletonSingleTreaded(value);
        }
        return instance;
    }
}
