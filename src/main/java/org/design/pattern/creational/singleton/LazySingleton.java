package org.design.pattern.creational.singleton;

/**
 * This is a singleton Java class with lazy instantiation
 *
 * @author Sourav Kumar
 * @version 1.0
 */

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

   
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
