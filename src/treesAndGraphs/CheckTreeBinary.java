//4.5
package treesAndGraphs;

public class CheckTreeBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean isTreeBinary (TreeNode root) {
		if (root.left != null) {
			if(isTreeBinary(root.left) == false || root.value < root.left.max)
				return false;
			root.min = root.left.min;
		}
		if (root.right != null) {
			if(isTreeBinary(root.right) == false || root.value > root.right.min)
				return false;
			root.max = root.right.max;
		}	
	
		if (root.left == null)
			root.min = root.value;
		if (root.right == null)
			root.max = root.value;
		return true;
	}
}
