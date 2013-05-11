//11.2

package sortingAndSearching;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		Anagrams ana = new Anagrams();
		String[] words = new String[] {"payment", "mentort", "colbert", "empatny", "torment", "john"};
		words = ana.anagrams(words);
		for (String word : words)
			System.out.println(word);
	}
	
	String[] anagrams(String[] words) {
		String[] newArray = new String[words.length];
		HashMap<String, LinkedList<Integer>> wordMap = new HashMap<String, LinkedList<Integer>>();
		int i = 0;
		for (String word : words) 
			sortAndHash(word, wordMap, i++);
		i=0;
		for (Map.Entry<String, LinkedList<Integer>> entrySet : wordMap.entrySet()) {
			LinkedList<Integer> indices = entrySet.getValue();
			int len = indices.size();
			for (int j=0; j<len; j++)
				newArray[i++] = words[indices.get(j)];			
		}
		return newArray;
	}
	
	void sortAndHash(String word, HashMap<String, LinkedList<Integer>> wordMap, int index) {
		String sortedWord = sortChars(word);
		LinkedList<Integer> indices = wordMap.get(sortedWord);;
		if (indices == null) 
			indices = new LinkedList<Integer>();
		indices.add(index);
		wordMap.put(sortedWord, indices);		
	}
	
	String sortChars (String word) {
		char[] arr = word.toUpperCase().toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
