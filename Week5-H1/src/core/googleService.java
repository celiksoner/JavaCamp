package core;

public interface googleService {
	void sendToVerifyMail(String email);
	boolean checkVerifyAccount(String email);
}
