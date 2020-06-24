package Exercices;

public class Cube extends ThreeDimShape {
	private double length;

	public Cube(String shapeName, String shapeType, double height, double length) {
		super(shapeName, shapeType, height);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return Math.pow(getLength(), 2);
	}
	
	@Override
	public double getVolume() {
		return getHeight() * Math.pow(getLength(), 2);
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: %.2f", super.toString(), "Length", getLength());
	}
}
