package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;

		if (number < 2)
			isPrime = false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		String result = isPrime ? "Asal Say?d?r." : "Say? Asal De?ildir.";
		System.out.println(result);

	}

}
