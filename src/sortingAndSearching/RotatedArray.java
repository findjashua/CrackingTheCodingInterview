//11.3

package sortingAndSearching;

public class RotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RotatedArray ra = new RotatedArray();
		int[] array = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		int val = 5;
		System.out.println(ra.search(array, val));
		array = new int[] {10, 15, 20, 0, 5};
		System.out.println(ra.search(array, val));
		array = new int[] {50, 5, 20, 30, 40};
		System.out.println(ra.search(array, val));
		array = new int[] {0, 5, 10, 15, 20};
		System.out.println(ra.search(array, val));
		array = new int[] {10, 15, 20, 0, 6, 8};
		System.out.println(ra.search(array, val));
	}
	
	int search(int[] array, int val) {
		return search(array, val, 0, array.length-1);
	}
	
	int search(int[] array, int val, int low, int high) {
		int mid;
		while (high - low > 1) {
			mid = (low + high)/2;
			if (array[mid] == val)
				return mid;
			if (array[mid] > array[low]) { //left half is sorted
				if (val < array[mid] && val >= array[low]) //value in left (sorted) half only if
					high = mid-1;
				else 
					low = mid+1; //value is in right half
			}
			if (array[mid] < array[high]) { //right half is sorted
				if (val > array[mid] && val <= array[high]) // value in right (sorted) half only if
					low = mid+1;
				else 
					high = mid-1;
			}
		}
		if (array[low] == val)
			return low;
		if (array[high] == val)
			return high;
		return -1;
	}
}
