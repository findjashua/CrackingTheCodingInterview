//4.1

package treesAndGraphs;

public class TreeBalance {

	public static void main(String[] args) {

	}
	
	boolean isTreeBalanced(TreeNode root) {
		if (maxDepth(root) - minDepth(root) > 1)
			return false;
		else 
			return true;
	}
	
	int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	int minDepth(TreeNode root) {
		if(root == null)
			return 0;
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}
}
