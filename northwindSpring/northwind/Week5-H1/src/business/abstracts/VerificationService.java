package business.abstracts;


public interface VerificationService {
	void sendMail(String email);
	void verifyMail(String email);
	boolean isVerificated(String email);
}
