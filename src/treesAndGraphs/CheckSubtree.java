package treesAndGraphs;

public class CheckSubtree {

	boolean isSubtree(TreeNode t1, TreeNode t2) {
		if(t1 == null || t2 == null)
			return false;
		if(t1.value == t2.value && matchTrees(t1, t2))
			return true;
		return (isSubtree(t1.left, t2) || isSubtree(t1.right, t2));
	}
	
	boolean matchTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null || t2 == null || t1.value != t2.value)
			return false;
		return (matchTrees(t1.left, t2.left) && matchTrees(t1.right, t2.right));
	}
}
