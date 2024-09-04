package homeassignmentweek3;

import java.util.Arrays;

public class MissingElementInaArray {
public static void main(String[] args) {
	int[] arr={1, 2, 3, 4, 10, 6, 8};
	Arrays.sort(arr);
	int len = arr.length;
	System.out.println("Sorted Array : "+Arrays.toString(arr));
	int[] temArr=new int[len+1];
	for(int i=0 ; i<len ; i++) {
		temArr[i] = arr[i];
		
	}
	int max = 0;
	for(int i= 0 ;i<temArr.length ; i++) {
		if(temArr[i]>max) {
			max=temArr[i];
			
		}
	}
	temArr[temArr.length-1]=max+1;
	
	System.out.println("Missing Numbers : ");
	for(int i=0 ; i<len-1 ; i++) {
		if(i==(len-1)&&(temArr[i+1]-arr[i])>1) {
			System.out.println(temArr[i]);
			
		}else if((arr[i+1]-arr[i])>1) {
			for(int j=1;j<=(arr[i+1]-arr[i])-1;j++) {
				System.out.println(arr[i] + j);
			}
		}
		
	}
}
}
