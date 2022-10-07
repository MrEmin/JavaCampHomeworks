package youTubeTutorial;

public class Main {

	public static void main(String[] args) {
		/*
		 * int sayi1 = 10; int sayi2 = 20; sayi1 = sayi2; sayi2 = 100;
		 * 
		 * System.out.println(sayi1); //20
		 */

		/*
		 * int [] sayilar1 = {1, 2, 3}; int [] sayilar2 = {10, 20, 30}; sayilar1 =
		 * sayilar2;
		 * 
		 * sayilar2[0] = 1000;
		 * 
		 * System.out.println(sayilar1[0]); //1000
		 */

		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.calculate();
		 * creditManager.save();
		 * 
		 * Customer customer = new Customer(); //örneğini oluşturmak, instance
		 * oluşturmak, instance creatin customer.id = 1; customer.city = "Ordu";
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save(); customerManager.delete();
		 * 
		 * Company company = new Company(); company.taxNumber = "11111111";
		 * company.companyName = "Aselsan"; company.id = 100;
		 * 
		 * CustomerManager customerManager2 = new CustomerManager(new Person());
		 * 
		 * 
		 * Person person = new Person(); person.firstName = "Muhammet";
		 * person.nationalIdentity = "Ordu";
		 * 
		 * Customer c1 = new Customer(); Customer c2 = new Person(); Customer c3 = new
		 * Company();
		 */
		
		// Interface
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
	}

}

class CreditManager {
	public void calculate() {
		System.out.println("Hesaplandı");
	}

	public void save() {
		System.out.println("Kredi verildi");
	}
}

interface ICreditManager {
	void calculate();
	void save();
}


abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("Kaydedildi");
	}
	
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		// hesaplamalar
		System.out.println("Öğretmen kredisi hesaplandı.");
	}
	
	@Override
	public void save() {
		//base.save(); hoca böyle yazdı.
		super.save();
		//
	}
	
}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı.");
		
	}
	// DRY - Don't Repeat Yourself	
}

class CarCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandı.");
	}
}

class Customer {
	int id;
	String city;

	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}

class Person extends Customer {
	String firstName;
	String lastName;
	String nationalIdentity;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}

class Company extends Customer{
	String companyName;
	String taxNumber;
	
	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}

// Katmanlı Mimariler
class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri kaydedildi : ");
	}
	
	public void delete() {
		System.out.println("Müşteri silindi : ");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
