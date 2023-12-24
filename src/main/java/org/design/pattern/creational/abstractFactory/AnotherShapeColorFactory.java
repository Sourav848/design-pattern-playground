package org.design.pattern.creational.abstractFactory;



public class AnotherShapeColorFactory implements IAbstractFactory{
	
	@Override
    public IShape createShape() {
        return new Square(); // You can create other shapes here
    }

    @Override
    public IColor createColor() {
        return new Blue(); // You can create other colors here
    }
	
}
