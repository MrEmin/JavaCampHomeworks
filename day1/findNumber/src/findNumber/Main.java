package findNumber;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int find = 6;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == find) {
				isThere = true;
				break;
			}
		}

		if (isThere) {
			System.out.println("Say� Mevcuttur");
		} else {
			System.out.println("Say� Mevcut De�ildir.");
		}
	}

}
