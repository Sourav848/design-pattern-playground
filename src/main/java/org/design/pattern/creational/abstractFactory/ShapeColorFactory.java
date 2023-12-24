package org.design.pattern.creational.abstractFactory;

public class ShapeColorFactory implements IAbstractFactory {

	@Override
	public IShape createShape() {
		return new Circle();
	}

	@Override
	public IColor createColor() {
		return new Red();
	}

}
