//1.8

package arraysAndStrings;

public class CheckStringRotated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean isRotated(String s1, String s2) {
		return(isSubstring(s1, s2.concat(s2)));
	}
	
	boolean isSubstring (String s1, String s2) {
		//KMP
		return false;
	}
}
