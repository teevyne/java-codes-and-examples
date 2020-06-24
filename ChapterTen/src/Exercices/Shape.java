package Exercices;

public abstract class Shape {
	private String shapeName;
	private String shapeType;
	
	public Shape(String shapeName, String shapeType) {
		this.shapeName = shapeName;
		this.shapeType = shapeType;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	
	public abstract double getArea();
	public abstract double getVolume();
	
	public String toString() {
		return String.format("%n%s: %s%n%s: %s", "Shape name", getShapeName(), "Shape type", getShapeType());
	}
}
