package chapterFour;

public class California extends PizzaStore {
	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new CaliforniaStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new CaliforniaStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new CaliforniaStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		} else return null;
	}
}