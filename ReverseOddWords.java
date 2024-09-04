package homeassignmentweek3;

public class ReverseOddWords {
	public static void main(String[] args) {
		String s="I am a software tester";
		String[] str = s.split(" ");
		String reverseString="";
		for(String x: str) {
			String reverseWord="";
			for(int i=x.length()-1;i>=0;i--) {
				reverseWord=reverseWord+x.charAt(i);
			}reverseString=reverseString+reverseWord+" ";
		}System.out.println(reverseString);
		
	}

}
