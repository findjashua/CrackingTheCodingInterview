package treesAndGraphs;

import java.util.LinkedList;

public class FindPathsToSum {
	
	LinkedList<String> findAllPaths (TreeNode root, int val) {
		LinkedList<String> paths = new LinkedList<String>();
		findAllPaths (root, val, paths);
		return paths;
	}
	
	void findAllPaths (TreeNode root, int val, LinkedList<String> paths) {
		if (root == null)
			return;
		String path = findPathFromNode(root, val);
		if (path != null)
			paths.add(path);
		findAllPaths(root.left, val, paths);
		findAllPaths(root.right, val, paths);
	}
	
	String findPathFromNode (TreeNode node, int val) {
		String path = null;
		return path;
	}
}
