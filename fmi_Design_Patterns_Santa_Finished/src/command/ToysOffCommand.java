package command;

public class ToysOffCommand implements Command {
	
	private Toys toy;
	
	public ToysOffCommand(Toys toy) {
		this.toy = toy;
	}

	@Override
	public void execute() {
		this.toy.turnOff();
	}

}
