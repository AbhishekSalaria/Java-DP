package org.java.dp.Creational.Singleton;

public final class SingletoMultithreading {
    private static volatile SingletoMultithreading instance;
    public String value;

    private SingletoMultithreading(String value) {
        this.value = value;
    }

    public static SingletoMultithreading getInstance(String value) {
        SingletoMultithreading result = instance;
        if(result != null) {
            return result;
        }
        synchronized (SingletoMultithreading.class) {
            if(instance == null) {
                instance = new SingletoMultithreading(value);
            }
            return instance;
        }
    }
}
