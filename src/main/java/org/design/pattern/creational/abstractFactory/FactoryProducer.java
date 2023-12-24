package org.design.pattern.creational.abstractFactory;

public class FactoryProducer {

	
	 public static IAbstractFactory getFactory(String factoryType) {
	        if ("ShapeColor".equalsIgnoreCase(factoryType)) {
	            return new ShapeColorFactory();
	        } else if ("AnotherShapeColor".equalsIgnoreCase(factoryType)) {
	            return new AnotherShapeColorFactory();
	        }
	        return null;
	    }
	
}
