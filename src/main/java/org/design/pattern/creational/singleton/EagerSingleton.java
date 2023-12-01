package org.design.pattern.creational.singleton;



/**
 * This is a singleton Java class with lazy instantiation
 *
 * @author Sourav Kumar
 * @version 1.0
 */

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
