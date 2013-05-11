//11.5

package sortingAndSearching;

public class ArrayWithEmptyStrings {

	public static void main(String[] args) {
		ArrayWithEmptyStrings awes = new ArrayWithEmptyStrings();
		String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String word = "ball";
		System.out.println(awes.search(array, word));
	}
	
	int search(String[] array, String word) {
		return search(array, word, 0, array.length-1);
	}
	
	int search(String[] array, String word, int low, int high) {
		int mid;
		while (high - low > 1) {
			mid = (low + high)/2;
			int i = mid;
			if (array[mid].equals(word))
				return mid;
			
			while (array[i].equals(""))
				i--;
			if (array[i].compareTo(word) > -1)
				high = i;
			else {
				i = mid;
				while (array[i].equals(""))
					i++;
				if (array[i].compareTo(word) < 1)
					low = i;
			}			
		}
		if (array[low].equals(word))
			return low;
		if(array[high].equals(word))
			return high;
		return -1;
	}
}
