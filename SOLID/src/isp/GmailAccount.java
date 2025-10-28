package isp;

public class GmailAccount implements Emailable{
	private String name, emailAddress;
	
	public GmailAccount(String name, String emailAddress) {
		this.emailAddress = emailAddress;
		this.name = name;
	}
	@Override
	public String getEmail() {
		return emailAddress;
	}
	public void setEmailAddress(String e) {
		emailAddress = e;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
