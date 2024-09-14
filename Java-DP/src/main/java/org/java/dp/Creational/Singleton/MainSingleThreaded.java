package org.java.dp.Creational.Singleton;

public class MainSingleThreaded {
    public static void main(String[] args) {
        SingletonSingleTreaded firstObject = SingletonSingleTreaded.getInstance("FirstObject");
        SingletonSingleTreaded secondObject = SingletonSingleTreaded.getInstance("SecondObject");

        System.out.println(firstObject.value);
        System.out.println(secondObject.value);

    }
}
