//1.4

package arraysAndStrings;

public class ReplaceSpace {

	public static void main(String[] args) {
		ReplaceSpace rs = new ReplaceSpace();
		System.out.println(rs.replace("Hello World !"));
	}
	
	String replace(String str) {
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<arr.length-1; i++){
			sb.append(arr[i]);
			sb.append("%20");
		}
		sb.append(arr[arr.length-1]);
		return sb.toString();
	}

}
