package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int counter = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				counter++;
			}
		}
		
		if (counter == 0 && number != 1) {
			System.out.println("Asal Say�");
		} else {
			System.out.println("Asal Say� De�il");
		}
		

	}

}
