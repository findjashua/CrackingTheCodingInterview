//1.1
package arraysAndStrings;

import java.util.HashSet;

public class UniqueCharacters {
		
	public static void main (String[] args) {
		UniqueCharacters uc = new UniqueCharacters();
		System.out.println (uc.uniqueChars("apple")); 
		System.out.println (uc.uniqueChars("mango")); 		
	}
	
	String uniqueChars(String word) {
		char[] arr = word.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for (char c : arr) {
			if (set.add(c) == false)
				return "false";
		}
		return "true";
	}

}
