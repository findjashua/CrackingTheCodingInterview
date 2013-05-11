//1.2
package arraysAndStrings;

public class ReverseString {

	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverse("mum"));
		System.out.println(rs.reverse("rum"));
	}
	
	String reverse(String word) {
		char[] arr = word.toCharArray();
		int i = 0, j = arr.length-1;
		while(i < j) {
			if(arr[i] != arr[j]) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
 			}
			i++; j--;
		}
		return new String(arr);
	}

}
