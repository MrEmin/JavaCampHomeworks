package perfectNumber;

public class Main {

	public static void main(String[] args) {
		// 6 --> 1, 2, 3
		// 28 --> 1, 2, 4, 7, 14

		int number = 8128;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (number == total) {
			System.out.println("M?kemmel Say?d?r");
		} else {
			System.out.println("M?kemmel Say? De?ildir.");
		}

	}

}
