package Exercices;

public class Cuboid extends ThreeDimShape {
	private double length;
	private double breadth;

	public Cuboid(String shapeName, String shapeType, double height, double length, double breadth) {
		super(shapeName, shapeType, height);
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return getLength() * getBreadth();
	}
	
	@Override
	public double getVolume() {
		return getHeight() * getArea();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f%n%s: %.2f", super.toString(), "Length", getLength(), "Breadth", getBreadth());
	}
}