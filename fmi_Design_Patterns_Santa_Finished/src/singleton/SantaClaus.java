package singleton;

public class SantaClaus {

	private static SantaClaus instance;
	
	private SantaClaus() {
	}

	public static SantaClaus getInstance() {
		
		if(instance == null) {
			instance = new SantaClaus();
		}
		
		return instance;
	}
	
	public void postMessage(String message) {
		System.out.println(" Santa says: " + message);
	}
	
}
