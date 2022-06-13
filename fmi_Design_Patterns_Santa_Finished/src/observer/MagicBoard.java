package observer;
import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

	private List<Observer> observers;
	private String topic;
	
	public MagicBoard() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		observer.setTopic(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.notifyObservers();
	}

}
