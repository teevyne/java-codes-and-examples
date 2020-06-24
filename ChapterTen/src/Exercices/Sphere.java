package Exercices;

public class Sphere extends ThreeDimShape {
	private double radius;

	public Sphere(String shapeName, String shapeType, double height, double radius) {
		super(shapeName, shapeType, height);
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
		return (4/3) * Math.PI * Math.pow(getRadius(), 2) * getHeight();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f", super.toString(), "Radius", getRadius());
	}
}
