package classes;

public class Main {

	public static void main(String[] args) {
		// referance type
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; // customerManager'ın refereans numarası artık customerManager2 ile aynı olmuştur.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2); // 10

		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}

}
