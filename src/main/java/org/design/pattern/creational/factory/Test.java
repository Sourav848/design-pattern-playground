package org.design.pattern.creational.factory;

/**
 * @author sourav848
 * @description abstract factor java implementation
 */
public class Test {

    public static void main(String[] args) {
        Phone phone = PhoneFactory.getPhone("iphone");
        if (phone != null) {
            phone.call();
        } else {
            System.out.println("Phone has been lost...");
        }
    }
}
