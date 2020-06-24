package chapterFour;

public abstract class PizzaStore {
	
	public Pizza orderPizza (String type) {
		Pizza pizza;
	
		pizza = createPizza(type); // 
	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	
		return pizza;
	}
	//other methods
	public abstract Pizza createPizza(String type);
}
