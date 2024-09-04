package homeassignmentweek3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String sen = "We learn Java basics as part of java sessions in java week1";
		String[] arr = sen.split(" ");
		Set<String> s = new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		for (String ss : s) {
			System.out.print(ss + " ");
		}
		System.out.println();
	}
	
}
