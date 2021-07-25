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
		//CustomerCheckManager'da bulunan isValid operasyonu tüm bilgiler doðru ise true oluyor. 
		//Bu bilgilerin tümünün doðru olmasý duurmunda email doðrulama mail'i gönderiliyor ve database ekleniyor.
		if (customerCheckService.isValid(customer) == true) {
			System.out.print(customer.getFirstName() + " kullanýcýsý baþarýyla sisteme eklendi.\n");
			mailVerificationService.sendMail(customer.getEmail());
			customerDao.add(customer);
		}

	}

	@Override
	public void signIn(Customer customer) {

		// Bu kodu çalýþtýrýrsak doðrulama mailine týklamýþ oluyoruz gibi düþünüyoruz.
		mailVerificationService.verifyMail(customer.getEmail());

		// Bu komutta isVerificated komutunu çaðýrarak buraya gönderilen kullanýcýnýn mail adresinin doðrulanan mail'ler listesinde olup olmadýðýný kontrol ediyoruz.
		if (customerDao.getEmail(customer.getEmail()) && customerDao.getPassword(customer.getPassword())
				&& mailVerificationService.isVerificated(customer.getEmail()) == true) {
			System.out.println("Kullanýcý giriþi baþarýyla yapýldý.");
			//Bu else if durumunda kullanýcý bilgileri ama mail doðrulanmadýysa uyarýsýný veriyoruz.
		} else if (mailVerificationService.isVerificated(customer.getEmail()) == false) {
			System.out.println("Kullanýcý bilgileri doðru. Fakat mail adresi doðrulanmadýðý için giriþ yapýlamýyor.");
		} else {
			System.out.println("Kullanýcý bilgileri yanlýþ, lütfen kontrol ediniz.");
		}
	}

}
