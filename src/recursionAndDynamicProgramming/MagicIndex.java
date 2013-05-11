//9.3

package recursionAndDynamicProgramming;

public class MagicIndex {

	public static void main(String[] args) {
		MagicIndex mi = new MagicIndex();
		int[] array = {-2, 0, 2, 4, 6, 8, 10};
		System.out.println(mi.findIndex(array));
		array = new int[] {-2, 2, 6, 10};
		System.out.println(mi.findIndex(array));
		array = new int[] {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
		System.out.println(mi.findIndex(array));
	}
	
	int findIndex(int[] array) {
		int low = 0, high = array.length-1;
		return findIndex(array, low, high);
	}
	
	int findIndex (int[] array, int low, int high) {
		if (high - low <= 1) {
			if (array[low] == low)
				return low;
			if (array[high] == high)
				return high;
			return -1;
		}
		int mid = (low+high)/2, temp = -1;
		if (array[mid] == mid)
			return mid;

		temp = findIndex(array, low, mid-1);
		if (temp != -1)
			return temp;
		
		temp = findIndex(array, mid+1, high);
		if (temp != -1)
			return temp;

		return -1;
	}
}
