package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	
	//Ayn� mail adresiyle kay�t olmay� engellemek i�in ba�ar�yla kay�t olan �yelerin mail'lerini bu diziye sakl�yoruz.
	//Daha sonra �yelik i�lemi yapmaya �al��an olursa buradaki liste ile kar��la�t�r�yoruz.
	List<String> listOfEmail = new ArrayList<String>();

	@Override
	public boolean checkFirstName(Customer customer) {
		if (customer.getFirstName().isEmpty()) {
			System.out.println("�sim alan� bo� b�rak�lamaz.");
			return false;
		} else {
			if (customer.getFirstName().length() < 3) {
				System.out.println("�sim 2 karakterden daha k���k olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkLastName(Customer customer) {
		if (customer.getLastName().isEmpty()) {
			System.out.println("Soyisim alan� bo� b�rak�lamaz.");
			return false;
		} else {
			if (customer.getLastName().length() < 3) {
				System.out.println("Soyisim 2 karakterden daha k���k olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (customer.getEmail().isEmpty()) {
			System.out.println("Email alan� bo� b�rak�lamaz.");
			return false;
		} else {
			if (pattern.matcher(customer.getEmail()).find() == false) {
				System.out.println("Girilen email adresi formata uygun de�il. �rnek: ornek@ornek.com");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if (customer.getPassword().isEmpty()) {
			System.out.println("Soyisim alan� bo� b�rak�lamaz.");
			return false;
		} else {
			if (customer.getPassword().length() < 6) {
				System.out.println("Parola 6 karakterden daha k���k olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(Customer customer) {
		boolean result=true;
		if (listOfEmail.contains(customer.getEmail())) {
			System.out.println("Bu mail adresi ile sisteme daha �nce kay�t olunmu�, farkl� bir mail adresi deneyiniz.");
			result=false;
		}else{
			result=true;
			listOfEmail.add(customer.getEmail());
		}		
		return result;
	}

	@Override
	public boolean isValid(Customer customer) {
		if (checkFirstName(customer) && checkLastName(customer) && checkEmail(customer) && checkPassword(customer)
				&& uniqueEmail(customer) == true) {
			return true;
		}
		return false;
	}

}
