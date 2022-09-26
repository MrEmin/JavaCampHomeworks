package vowels;

public class Main {

	public static void main(String[] args) {
		char letter = 'I';

		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf");
			break;
		default:
			System.out.println("Ýnce sesli harf");
		}

		// ---------------------------------------------------------------------
		if (letter == 'A' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println("Kalýn Sesli Harf");
		} else if (letter == 'E' || letter == 'Ý' || letter == 'Ö' || letter == 'Ü') {
			System.out.println("Ýnce Sesli Harf");
		} else {
			System.out.println("Geçersiz Deðer");
		}

	}

}
