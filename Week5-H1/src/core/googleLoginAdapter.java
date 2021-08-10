package core;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.VerificationService;

public class googleLoginAdapter implements VerificationService{
	List<String> verificatedEmails = new ArrayList<String>();

	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " kullan�c�s�na do�rulama mail'i g�nderildi.");	
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;	
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email + " ba�ar�yla do�ruland�.");		
	}

	


	
	

}
