//4.7
package treesAndGraphs;

public class LowestCommonAncestor {
	
	TreeNode findLCA (TreeNode root, TreeNode node1, TreeNode node2) {
		if (root == null)
			return null;
		if(nodeInTree(root.left, node1) && nodeInTree(root.left, node2))
			return findLCA(root.left, node1, node2);
		if(nodeInTree(root.right, node2) && nodeInTree(root.right, node2))
			return findLCA(root.right, node1, node2);
		if(nodeInTree(root, node1) && nodeInTree(root, node2))
			return root;
		else
			return null;
	}
	
	boolean nodeInTree(TreeNode root, TreeNode node) {
		if (root == null)
			return false;
		if (root == node)
			return true;		
		return (nodeInTree(root.left, node) || nodeInTree(root.right, node));
	}
}
