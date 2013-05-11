package treesAndGraphs;

import java.util.*;

public class NodesByDepth {

	public static void main(String[] args) {

	}
	
	LinkedList<LinkedList<TreeNode>> rootToListOfLists(TreeNode root) {
		LinkedList<LinkedList<TreeNode>> result = new LinkedList<LinkedList<TreeNode>>();
		result.add(new LinkedList<TreeNode>());
		root.depth = 1;
		root.visited = true;
		result.getLast().add(root);
		LinkedList<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(q.size() > 0) {
			TreeNode node = q.remove();
			process(node.left, node.depth, q, result);
			process(node.right, node.depth, q, result);			
		}
		return result;
	}
	
	void process(TreeNode node, int depth, LinkedList<TreeNode> q, LinkedList<LinkedList<TreeNode>> result) {
		if(node != null && node.visited == false) {
			node.depth = depth+1;
			node.visited = true;
			q.add(node);
			if (node.depth > result.size())
				result.add(new LinkedList<TreeNode>());
			result.getLast().add(node);
		}
	}
}
