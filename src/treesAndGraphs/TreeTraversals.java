package treesAndGraphs;

import java.util.*;

public class TreeTraversals {
	
	static TreeNode preOrder(TreeNode root) {
		if(root.condition() == true)
			return root;
		LinkedList<TreeNode> q = new LinkedList<TreeNode>();
		root.visited = true;
		q.add(root);
		boolean found = false;
		while(q.size() > 0) {
			TreeNode node = q.remove();
			found = process(q, node.left);
			if(found == true)
				return node.left;
			found = process(q, node.right);
			if(found == true)
				return node.right;
		}
		return null;
	}
	
	private static boolean process(LinkedList<TreeNode> q, TreeNode node) {	
		boolean found = false;
		if(node != null) {
			if (node.condition() == true)
				return true;
			node.visited = true;
			q.add(node);		
		}
		return found;
	}
	
	static TreeNode postOrder(TreeNode root) {
		TreeNode node = null;
		if(root.left != null)
			node = postOrder(root.left);
		if(root.right != null && node == null)
			node = postOrder(root.right);
		if(root.condition() == true)
			node = root;
		return node;
	}
	
	static TreeNode inOrder(TreeNode root) {
		TreeNode node = null;
		if(root.left != null)
			node = inOrder(root.left);
		if (node == null && root.condition() == true)
			node = root;
		if(node == null && root.right != null)
			node = inOrder(root.right);
		return node;
	}
}
