package recapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double maxNumber = myList[0];

		for (double number : myList) {
			if (maxNumber < number) {
				maxNumber = number;
			}
			total += number;
			System.out.println(number);
		}

		System.out.println("Toplam = " + total);
		System.out.println("En B?y?k Say? = " + maxNumber);

	}

}
