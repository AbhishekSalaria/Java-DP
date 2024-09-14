package org.java.dp.Creational.AbstractFactory;

/**
 * @author abhishek.salaria
 */
public class SimCardFactory {
    public static ISimCardProvider createSim(ISimCardAbstractFactory simCardAbstractFactory) {
        return simCardAbstractFactory.createSim();
    }
}
