package homeassignmentweek3;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("Enter User name");
	}

	public void enterPassword() {
		System.out.println("Enter password");

	}
	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();
	}
}
