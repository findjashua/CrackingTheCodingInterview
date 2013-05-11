//1.3

package arraysAndStrings;

import java.util.*;
import java.util.Map.Entry;

public class Anagrams {

	
	public static void main(String[] args) {
		Anagrams ana = new Anagrams();
		System.out.println(ana.anagram(new String[] {"asdf", "sadf", "fads", "dafs"}));
		System.out.println(ana.anagram(new String[] {"asdf", "sadf", "fads", "dafh"}));
	}

	String anagram(String[] arr) {
		int numStrings = arr.length;
		List<HashMap<Character, Integer>> maps = new ArrayList<HashMap<Character, Integer>>(numStrings);	
		
		for (int i = 0; i<numStrings; i++) {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			maps.add(map);
			char[] str = arr[i].toCharArray();	
			for (char c : str) {
				if (map.containsKey(c) == false)
					map.put(c, 1);
				else
					map.put(c, map.get(c)+1);
			}
		}
		
		Iterator<Entry<Character, Integer>> iter = maps.get(0).entrySet().iterator();
		while(iter.hasNext()) {
			char key = iter.next().getKey();
			int value = iter.next().getValue();
			for (HashMap<Character, Integer> map : maps) {
				if(map.containsKey(key) == false || map.get(key) != value)
					return "false";
			}
		}
		return "true";
	}	
}
