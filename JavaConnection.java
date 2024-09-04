package homeassignmentweek3;

public abstract class JavaConnection implements DatabaseConnection{
@Override
public void connect() {
System.out.println("Connect");	
}
	@Override
		public void disconnect() {
System.out.println("Disconnect");			
		}
	public void executeUpdate() {

	}
}