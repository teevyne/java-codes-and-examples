package chapterTen;

public class Trapezium implements Quadilateral {
	private double sideA;
	private double sideB;
	private double height;
	
	@Override
	public double area() {
		return 0.5 * (sideA + sideB) * height;
	}

	@Override
	public double area1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area11() {
		// TODO Auto-generated method stub
		return 0;
	}
}
