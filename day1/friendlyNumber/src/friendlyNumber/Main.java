package friendlyNumber;

public class Main {

	public static void main(String[] args) {
		// 220 - 284
		// 220 : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
		// 284 : 1 + 2 + 4 + 71 + 142 = 220

		int number = 220;
		int number1 = 284;
		int total = 0;
		int total1 = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}

		if (number == total1 && number1 == total) {
			System.out.println("Bu İki Sayı Arkadaş Sayıdır");
		} else {
			System.out.println("Bu İki Sayı Arkadaş Sayı Değildir.");
		}

	}

}
