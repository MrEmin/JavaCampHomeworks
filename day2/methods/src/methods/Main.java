package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
		findNumber();
		findNumber();
		findNumber();
		findNumber();
	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int find = 7;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == find) {
				isThere = true;
				break;
			}
		}

		if (isThere) {
			sendMessage("Sayı Mevcuttur:" + find);
		} else {
			sendMessage("Sayı Mevcut Değildir:" + find);
		}
	}

	public static void sendMessage(String message) { // parametreli metod
		System.out.println(message);
	}

}
