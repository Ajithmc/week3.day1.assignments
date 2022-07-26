package ArraysAssignment;

import java.util.Arrays;

public class MissingElement {
	
	public static void main(String[] args) {
		// the input
		int[] no = {1,2,3,4,7,6,8};
		int length = no.length + 1;
		// Sort 
		Arrays.sort(no);	
		int sum = length*(length+ 1)/2;
	
		// loop through the array
		for(int i = 0; i<no.length;i++) {
			
			sum = sum - no[i];
		}
		System.out.println("The Missing Element is = "+sum);
	}
}
