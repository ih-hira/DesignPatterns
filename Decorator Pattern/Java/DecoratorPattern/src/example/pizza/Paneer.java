package example.pizza;

public class Paneer extends ToppingsDecorator {

	Pizza pizza;

	public Paneer(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Paneer ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 70 + pizza.getCost();
	}

}
