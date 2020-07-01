package example.pizza;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Margherita();
		
		System.out.println(pizza.getDescription() + " Cost :" + pizza.getCost());

		Pizza pizza2 = new FarmHouse();

		pizza2 = new FreshTomato(pizza2);

		pizza2 = new Paneer(pizza2);

		System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());
		
		Pizza pizza3 = new Barbeque(null);
		System.out.println(pizza3.getDescription() + "  Cost :" + pizza3.getCost());
	}

}
