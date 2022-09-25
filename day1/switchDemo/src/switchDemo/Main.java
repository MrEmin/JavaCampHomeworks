package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		case 'F':
		case 'G': // Ýki koþulda ayný sonucu veriyorsa bu þekilde alt alta yazabiliriz.
			System.out.println("Maalesef: Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz!"); // Yukardaki deðerler dýþýnda baþka bir deðer girilirse
															// default sonuç ekrana yazdýrýlýr.
		}

	}

}
