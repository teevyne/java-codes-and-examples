package Exercices;

public class ShapeTest {
	public static void main (String[] args) {
		Shape[] shape = new Shape[7];
		
		Sphere sphere = new Sphere("Sphere", "3Dim", 9, 5);
		
		shape[0] = sphere;
		shape[1] = new Cube("Cube","3Dim", 10, 15);
		shape[2] = new Cuboid("Cuboid", "3Dim", 7, 5, 9);
		shape[3] = new Sphere("Sphere","3Dim", 7.5, 3.75);
		shape[4] = new Cube("Cube", "3Dim", 7, 5);
		shape[5] = new Cuboid("Cuboid","3Dim", 10, 15, 3.75);
		shape[6] = new Circle("Circle", "2Dim", 7.25);
		//Add for squarea and rectangles
		
		for(Shape anyShape : shape) {
			System.out.printf("%s%n%s: %.2f%n%s: %.2f%n", anyShape.toString(), "Surface Area", anyShape.getArea(), "Volume", anyShape.getVolume());
		}
		
		System.out.println();
		for (int j = 0; j < shape.length; j++)
			System.out.printf("Shape %d is a %s%n", j + 1, shape[j].getClass().getName());
	}
}
