package chapterThree;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
//	public Mocha(Beverage beverage2) {
//		// TODO Auto-generated constructor stub
//	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost () {
		return beverage.cost() + 0.20;
	}

}
