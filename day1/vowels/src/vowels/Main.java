package vowels;

public class Main {

	public static void main(String[] args) {
		char letter = 'I';

		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break;
		default:
			System.out.println("�nce sesli harf");
		}

		// ---------------------------------------------------------------------
		if (letter == 'A' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println("Kal�n Sesli Harf");
		} else if (letter == 'E' || letter == '�' || letter == '�' || letter == '�') {
			System.out.println("�nce Sesli Harf");
		} else {
			System.out.println("Ge�ersiz De�er");
		}

	}

}
