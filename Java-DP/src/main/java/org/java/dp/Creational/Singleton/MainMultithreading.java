package org.java.dp.Creational.Singleton;

public class MainMultithreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletoMultithreading firstInstance = SingletoMultithreading.getInstance("firstObject");
                System.out.println(firstInstance.value);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletoMultithreading secondInstance = SingletoMultithreading.getInstance("secondObject");
                System.out.println(secondInstance.value);
            }
        });

        t1.start();
        t2.start();
    }
}
