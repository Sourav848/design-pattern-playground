package org.design.pattern.creational.factory;

/**
 * @author sourav848
 */
public class PhoneFactory {

    public static Phone getPhone(String type) {
        if ("iphone".equalsIgnoreCase(type)) {
            return new IPhone();
        } else if ("miphone".equalsIgnoreCase(type)) {
            return new MiPhone();
        }
        return null;
    }
}
