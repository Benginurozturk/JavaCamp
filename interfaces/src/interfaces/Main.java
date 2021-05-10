package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer benginur = new Customer(1, "Benginur", "Öztürk");
		customerManager.add(benginur);
	}

}
