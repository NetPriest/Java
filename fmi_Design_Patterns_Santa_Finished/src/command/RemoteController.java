package command;

public class RemoteController {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		if(this.command == null) {
			System.out.println("No command set");
			return;
		}
		this.command.execute();
	}
	
}
