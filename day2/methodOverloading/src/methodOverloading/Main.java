package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.plus(2, 3));
		fourOperations.plus(2, 3, 5);

	}

}
