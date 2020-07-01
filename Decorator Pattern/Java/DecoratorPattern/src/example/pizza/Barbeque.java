package example.pizza;

public class Barbeque extends ToppingsDecorator {

	Pizza pizza;

	public Barbeque(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Barbeque ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 90 + pizza.getCost();
	}

}
