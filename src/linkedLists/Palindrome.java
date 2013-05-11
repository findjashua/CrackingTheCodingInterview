package linkedLists;

import java.util.*;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean isPalindrome(LinkedList<Character> list) {
		int mid = list.size()/2;
		LinkedList<Character> reversed = new LinkedList<Character>();
		ListIterator<Character> iter = list.listIterator();
		for (int i=0; i<mid; i++) {
			reversed.addFirst(iter.next());
		}
		iter = list.listIterator();
		ListIterator<Character> iter2 = reversed.listIterator();
		for (int i=0; i<mid; i++) {
			if(iter.next() != iter2.next())
				return false;
		}
		return true;
	}
}
