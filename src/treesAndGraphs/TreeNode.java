package treesAndGraphs;

public class TreeNode extends Node{
	public TreeNode left, right, parent;
	public int depth, min, max, leftSubtreeSize;
	public TreeNode(int val) {
		super(val);
	}	
}

