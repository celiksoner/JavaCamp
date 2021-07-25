package google;

import core.googleService;

public class LoginGoogleManager implements googleService{


	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " kullanýcýsna doðrulama mail'i gönderildi.");
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		System.out.println(email + " kullanýcýsýnýn hesabý doðrulandý.");
		return true;
	}

	
}
