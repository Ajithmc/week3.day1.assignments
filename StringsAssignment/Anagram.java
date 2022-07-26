package StringsAssignment;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";//string1
		String text2 = "potss";//string2
		int x =text1.length();//length of string1
		int y =text2.length();//length of string2
		if(x == y )//if condition to check its a anagram
			{
			System.out.println("It is a Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
		char arr1[] = text1.toCharArray();//convert to chararray
		char arr2[] = text2.toCharArray();
	Arrays.sort(arr1);//sort
	Arrays.sort(arr2);
		if(arr1.equals(arr2)) {
			System.out.println("Both has Same value");
		}
		else {
			System.out.println("Not a Same value");
		}
	}

}
