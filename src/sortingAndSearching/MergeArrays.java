//11.1

package sortingAndSearching;

public class MergeArrays {

	public static void main(String[] args) {

	}
	
	void merge (int[] a, int[] b, int lastA, int lastB) {
		int last = lastA + lastB + 1;
		while (lastA >= 0 && lastB >=0) {
			if (a[lastA] > b[lastB]) 
				a[last--] = a[lastA--];
			else
				a[last--] = b[lastB--];
		}
		
		while (lastB > 0)
			a[last--] = b[lastB--];
	}
}
