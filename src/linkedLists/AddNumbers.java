//2.5

package linkedLists;

import java.util.*;

public class AddNumbers {

	public static void main(String[] args) {
		AddNumbers an = new AddNumbers();
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(7, 1, 6));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(5, 9, 2, 1));
		System.out.println(an.addLists(list1, list2));
		System.out.println(an.addReversedLists(list1, list2));
	}
	
	LinkedList<Integer> addLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		ListIterator<Integer> iter1 = list1.listIterator();
		ListIterator<Integer> iter2 = list2.listIterator();
		int val = 0;
		while(iter1.hasNext() && iter2.hasNext()) {
			val += iter1.next() + iter2.next();
			if (val < 10)
				result.addFirst(val);
			else 
				result.addFirst(val%10);
			val = val/10;	
		}
		while (iter1.hasNext())
			result.addFirst(val + iter1.next());
		while (iter2.hasNext())
			result.addFirst(val + iter2.next());
		return result;
	}
	
	LinkedList<Integer> addReversedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> rList1 = reverse(list1);
		LinkedList<Integer> rList2 = reverse(list2);
		return addLists(rList1, rList2);
	}
	
	LinkedList<Integer> reverse(LinkedList<Integer> list) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext())
			result.addFirst(iter.next());
		return result;
	}
}
