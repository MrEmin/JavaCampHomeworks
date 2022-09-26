package classes;

public class Main {

	public static void main(String[] args) {
		// referance type
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; //customerManager'ın refereans numarası artık customerManager2 ile aynı olmuştur.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
	}

}
