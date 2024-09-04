package homeassignmentweek3;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int arr[]= {3, 2, 11, 4, 6, 7};
		int arr2[]={1, 2, 8, 4, 9, 7};
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr2.length ; j++) {
				if(arr[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
	}

}
