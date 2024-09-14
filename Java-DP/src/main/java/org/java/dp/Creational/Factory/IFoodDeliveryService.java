package org.java.dp.Creational.Factory;

/**
 * @author abhishek.salaria
 *
 * It is a creational design pattern that talks about the creation of an object.
 * The factory design pattern says to define an interface ( A java interface or an abstract class)
 * for creating the object and let the subclasses decide which class to instantiate. (@GeeksForGeeks)
 *
 * THIS IS THE PIZZA FACTORY CLASS FOR CREATING DIFFERNT TYPE OF PIZZAS
 */
public interface IFoodDeliveryService {
    public String getName();

    public void serviceLogic();
}
