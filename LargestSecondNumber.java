package homeassignmentweek3;

import java.util.Arrays;

public class LargestSecondNumber {
public static void main(String[] args) {
	int arr[]= {3, 2, 11, 4, 6, 7};
	int size=arr.length;
	Arrays.sort(arr);
	System.out.println("Sorted Array :"+Arrays.toString(arr));
	int res = arr[size-2];
	System.out.println("Output : "+res);
			}
}
