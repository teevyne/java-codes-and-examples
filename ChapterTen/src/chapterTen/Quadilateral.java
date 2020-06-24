package chapterTen;

public interface Quadilateral {
	public double area();

	double area1();
	//anything in a interface is by default public
	//Here all you do, for now, is declare methods. You cannot totally implement interface

	double area11();
}

//You cannot instantiate an interface
//Instead we can do an arrayList... List is an interface, arrayList is an implementation of it
//You cant make an instance of an abstract class too.
//An abstract class must have at least one abstract method