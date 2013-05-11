package treesAndGraphs;

public class NodeSuccessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	TreeNode getSuccessor(TreeNode node) {
		if (node == null)
			return null;
		if (node.right == null) {
			while(node.parent != null && node.parent.right == node)
				node = node.parent;
			if (node.parent == null)
				return null;
			node = node.parent.right;
		}
		else 
			node = node.right;
		while (node.left != null)
			node = node.left;
		return node;
	}
	
}
