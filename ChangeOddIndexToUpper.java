package homeassignmentweek3;

public class ChangeOddIndexToUpper {
	public static void main(String[] args) {
		String s = "changeme";
		char[] ch = s.toCharArray();
		for(int i=0 ; i<ch.length ; i=i+2) {
			ch[i] = Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));
	}

}