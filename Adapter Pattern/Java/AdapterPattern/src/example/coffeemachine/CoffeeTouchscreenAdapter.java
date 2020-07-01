package example.coffeemachine;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeeMachine oldMachine;
	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine)
	{
		this.oldMachine = oldMachine;
	}
	@Override
	public void chooseFirstSelection() {
		// TODO Auto-generated method stub
		oldMachine.selectA();
		
	}

	@Override
	public void chooseSecondSelection() {
		// TODO Auto-generated method stub
		oldMachine.selectB();
	}

}
