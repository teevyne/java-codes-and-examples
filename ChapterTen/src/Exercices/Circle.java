package Exercices;

public class Circle extends TwoDimShape {
	private double radius;

	public Circle(String shapeName, String shapeType, double radius) {
		super(shapeName, shapeType);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	@Override
	public double getVolume() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f", super.toString(), "Radius", getRadius());
	}
}
