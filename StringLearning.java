package homeassignmentweek3;

import java.util.Arrays;

public class StringLearning {
	
	private static boolean areAnagram(String s1, String s2) {
		char[] charArray = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray, charArray2);
	}
	public static void main(String[] args) {
		String str="stops";
		String str1="topss";
		if(areAnagram(str, str1)) {
			System.out.println("The given statement are anagram");
		}else {
			System.out.println("The given statement are not anagram");
		}
	}

	

}
