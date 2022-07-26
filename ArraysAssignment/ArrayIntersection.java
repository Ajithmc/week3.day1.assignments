package ArraysAssignment;
//week3 day 1....
public class ArrayIntersection {

	public static void main(String[] args) {
		int arr1[] = {3,2,11,4,6,7};//array 1
		 int  arr2[] =  {1,2,8,4,9,7};//array 2
		 int i =0;
		 int j = 0;
		 while(i<arr1.length && j<arr2.length) {
			 if(arr1[i]==arr2[j]) {
	 System.out.println("Numbers of INTERSECTION between two arrays is  "+arr1[i]);
				 i++;
				 j++;
			 }
	// System.out.println("Numbers of INTERSECTION between two arrays is  "+arr1[i]);
			 else if(arr1[i]>arr2[j]) {
				 j++;
			 }else {
				 i++;
			 }
	}

}
}