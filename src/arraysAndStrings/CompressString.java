//1.5

package arraysAndStrings;

public class CompressString {

	public static void main(String[] args) {
		CompressString cc = new CompressString();
		System.out.println(cc.compress("aabcccccaaa"));
		System.out.println(cc.compress("aabccccca"));
		System.out.println(cc.compress("abcde"));
	}
	
	String compress(String str) {
		String temp = charCount(str);
		if(temp.length() > str.length())
			return str;
		else 
			return temp;
	}
	
	String charCount(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i=1; i<arr.length; i++) {	
			if(arr[i-1] == arr[i]){
				count++;
			}
			else {
				sb.append(arr[i-1]);
				sb.append(Integer.toString(count));
				count = 1;
			}
		}

		sb.append(arr[arr.length-1]);
		sb.append(Integer.toString(count));
		return sb.toString();
	}

}
