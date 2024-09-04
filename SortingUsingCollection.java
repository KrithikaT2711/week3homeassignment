package homeassignmentweek3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
public static void main(String[] args) {
	List<String> myList = new ArrayList<String>();
	myList.add("HCL");
	myList.add("Wipro");
	myList.add("Aspire Systems");
	myList.add("CTS");
	
	Collections.sort(myList);
	for(int i=0;i<myList.size();i++) {
		System.out.println(myList.get(i));
	}
	
			}
}
