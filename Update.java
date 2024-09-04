package homeassignmentweek3;

public class Update extends JavaConnection{
	@Override
	public void executeUpdate() {
		System.out.println("Execute Update");
	}
	public static void main(String[] args) {
		Update up = new Update();
		up.connect();
		up.disconnect();
		up.executeUpdate();
	}

}
