package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String newMessage = message.substring(0, 2); // substring bir şey oluşturdu ve onu bize sonuç olarak veriyor. Yani return ediyor.
		String newMessage1 = giveCity(); // giveCity() fonksiyonu String döndürdüğü için problem yaşamayız.
		System.out.println(newMessage);

		int number = sum(15, 7);
		System.out.println(number);

		int total = sum2(2, 3, 4, 5, 6, 10);
		System.out.println(total);
	}

	// void bize sonuç olarak bir şey vermez. Void olan operasyonları bir değişkene atayamayız.
	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
		return; // fonksiyonu bitir.
	}

	public static int sum(int number1, int number2) {
		return number1 + number2; // toplamı döndür.
	}

	public static int sum2(int... numbers) { // Gönderdiğimiz sayıları arka planda bir dizide biriktirir. Buna Variable Arguments denir.
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static String giveCity() {
		return "Ankara";
	}

}
