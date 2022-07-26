package StringsAssignment;
//changing odd to upperCase
public class ChangeOddIndexToUpperCase {
//main method
	public static void main(String[] args) {
		String test = "changeme";//string input
		char[] str = test.toCharArray();//converting string to chararray
		int S = str.length;
		for(int i = 0; i < S;i++) {
			//oddIndex to UpperCase
			if(i%2==0) {
			System.out.print(test.substring(i, i+1).toUpperCase());
			}
			else {
				System.out.print(test.substring(i, i +1).toLowerCase());
			}
	
		}
		
		
}

}
