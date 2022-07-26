package StringsAssignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textarr = text.split(" ");
		
		Set<String>s = new LinkedHashSet<String>();
		
for(int i = 0;i <textarr.length;i++) {	
	s.add(textarr[i]);
		}
for(String word : s) {
	System.out.print(word+" ");
}
	
	}

}
