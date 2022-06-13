package command;

public class ToysOnCommand implements Command {

	private Toys toy;
	
	public ToysOnCommand(Toys toy) {
		this.toy = toy;
	}

	@Override
	public void execute() {
		this.toy.turnOn();
	}

}
