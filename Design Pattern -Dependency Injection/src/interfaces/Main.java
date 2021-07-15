package interfaces;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
				
		Customer fatih = new Customer(1,"Muhammed Fatih","AKTAÞ");
		customerManager.add(fatih);
		
	}

}
