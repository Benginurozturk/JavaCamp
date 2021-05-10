package interfaces;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println("müþteri eklendi" + customer.getFirstName());
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "veri tabanýna loglandý");
	}
	
	public void delete (Customer customer) {
		System.out.println("müþteri silindi" + customer.getFirstName());
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "veri tabanýna loglandý");
	}
}