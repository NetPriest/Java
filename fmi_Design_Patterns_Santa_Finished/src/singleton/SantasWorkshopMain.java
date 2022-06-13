package singleton;

import command.Command;
import command.Toys;
import command.ToysOffCommand;
import command.ToysOnCommand;
import command.RemoteController;
import factorymethod.BikeFactory;
import factorymethod.ToyFactory;
import factorymethod.ToyProduct;
import factorymethod.DollFactory;
import observer.Dwarfs;
import observer.MagicBoard;
import observer.Observer;

public class SantasWorkshopMain {

	public static void main(String[] args) {
		SantaClaus connection = SantaClaus.getInstance();
		connection.postMessage(" I need bicycles!");
		connection.postMessage(" I need dolls!");

		Toys toy = new Toys();
		Command toyOnCommand = new ToysOnCommand(toy);
		Command toyOffCommand = new ToysOffCommand(toy);

		RemoteController remote = new RemoteController();

		remote.setCommand(toyOnCommand);
		remote.pressButton();

		remote.setCommand(toyOffCommand);
		remote.pressButton();

		MagicBoard topic = new MagicBoard();
		Observer obs1 = new Dwarfs(" Dwarf 01");
		Observer obs2 = new Dwarfs(" Dwarf 02");

		topic.subscribe(obs1);
		topic.setTopic(" Construct Bikes! ");
		topic.unsubscribe(obs1);

		topic.subscribe(obs2);
		topic.setTopic(" Construct Dolls!");
		topic.unsubscribe(obs2);

		ToyFactory bikeFactory = new BikeFactory();

		ToyProduct bike = bikeFactory.produceProduct("BIKE");

		ToyFactory dollFactory = new DollFactory();
		ToyProduct doll = dollFactory.produceProduct("DOLL");
	}

}
