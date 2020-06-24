package Exercices;

public abstract class TwoDimShape extends Shape{
	public TwoDimShape(String shapeName, String shapeType) {
		super(shapeName, shapeType);
	}	
	
	public abstract double getArea();
	
	@Override
	public String toString() {
		return String.format("%s", super.toString());
	}
}
