package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import business.abstracts.VerificationService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;
	VerificationService mailVerificationService;
	CustomerDao customerDao;

	public CustomerManager(
			CustomerCheckService customerCheckService, 
			VerificationService mailVerificationService,
			CustomerDao customerDao) {
		this.customerCheckService = customerCheckService;
		this.mailVerificationService = mailVerificationService;
		this.customerDao = customerDao;
	}

	@Override
	public void signUp(Customer customer) {
		//CustomerCheckManager'da bulunan isValid operasyonu t�m bilgiler do�ru ise true oluyor. 
		//Bu bilgilerin t�m�n�n do�ru olmas� duurmunda email do�rulama mail'i g�nderiliyor ve database ekleniyor.
		if (customerCheckService.isValid(customer) == true) {
			System.out.print(customer.getFirstName() + " kullan�c�s� ba�ar�yla sisteme eklendi.\n");
			mailVerificationService.sendMail(customer.getEmail());
			customerDao.add(customer);
		}

	}

	@Override
	public void signIn(Customer customer) {

		// Bu kodu �al��t�r�rsak do�rulama mailine t�klam�� oluyoruz gibi d���n�yoruz.
		mailVerificationService.verifyMail(customer.getEmail());

		// Bu komutta isVerificated komutunu �a��rarak buraya g�nderilen kullan�c�n�n mail adresinin do�rulanan mail'ler listesinde olup olmad���n� kontrol ediyoruz.
		if (customerDao.getEmail(customer.getEmail()) && customerDao.getPassword(customer.getPassword())
				&& mailVerificationService.isVerificated(customer.getEmail()) == true) {
			System.out.println("Kullan�c� giri�i ba�ar�yla yap�ld�.");
			//Bu else if durumunda kullan�c� bilgileri ama mail do�rulanmad�ysa uyar�s�n� veriyoruz.
		} else if (mailVerificationService.isVerificated(customer.getEmail()) == false) {
			System.out.println("Kullan�c� bilgileri do�ru. Fakat mail adresi do�rulanmad��� i�in giri� yap�lam�yor.");
		} else {
			System.out.println("Kullan�c� bilgileri yanl��, l�tfen kontrol ediniz.");
		}
	}

}
