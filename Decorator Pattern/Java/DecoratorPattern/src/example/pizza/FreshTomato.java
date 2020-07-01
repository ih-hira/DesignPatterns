package example.pizza;

public class FreshTomato extends ToppingsDecorator {

	Pizza pizza;

	public FreshTomato(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Fresh Tomato ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 40 + pizza.getCost();
	}

}
