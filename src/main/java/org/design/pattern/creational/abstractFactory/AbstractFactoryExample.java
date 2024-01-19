package org.design.pattern.creational.abstractFactory;


/**
 * Demonstration of Abstract Factory class by giving two factory class and implemented layer
 * of abstraction 
 *
 * Client --> FactoryProducer -> IAbstractFactory --->Factory1
 *                                            |
 *                                            |---->  Factory2.....Factory..n
 * 
 */

//Client code
public class AbstractFactoryExample {

	public static void main(String[] args) {
        IAbstractFactory factory = FactoryProducer.getFactory("ShapeColor");
        IShape shape = factory.createShape();
        IColor color = factory.createColor();

        shape.draw();
        color.fill();
    }
	
}
