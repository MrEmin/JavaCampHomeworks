package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok G�zel : Ge�tiniz");
			break;
		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�tiniz");
			break;
		case 'F':
		case 'G': // �ki ko�ulda ayn� sonucu veriyorsa bu �ekilde alt alta yazabiliriz.
			System.out.println("Maalesef: Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz!"); // Yukardaki de�erler d���nda ba�ka bir de�er girilirse
															// default sonu� ekrana yazd�r�l�r.
		}

	}

}
