package Exercices;

public abstract class ThreeDimShape extends Shape {
	private double height;
	
	public ThreeDimShape(String shapeName, String shapeType, double height) {
		super(shapeName, shapeType);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public abstract double getArea();
	public abstract double getVolume();
	
	@Override
	public String toString() {
		return String.format("%s%nHeight: %.2f", super.toString(), getHeight());
	}
}

























//public class ShapeThreeDim implements Shape {
//	private double length;
//	private double height;
//	private double breadth;
//	private double radius;
//	
//	public ShapeThreeDim(double length, double height, double breadth, double radius) {
//		this.length = length;
//		this.height = height;
//		this.breadth = breadth;
//		this.radius = radius;
//	}
//
//		public double getLength() {
//		return length;
//	}
//
//	public void setLength(double length) {
//		this.length = length;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	public double getBreadth() {
//		return breadth;
//	}
//
//	public void setBreadth(double breadth) {
//		this.breadth = breadth;
//	}
//
//	public double getRadius() {
//		return radius;
//	}
//
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
//
//	public double getArea() {
//		return 
//	}
//}
