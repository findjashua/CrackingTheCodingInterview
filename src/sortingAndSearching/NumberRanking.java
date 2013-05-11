//11.8

package sortingAndSearching;

import treesAndGraphs.TreeNode;

public class NumberRanking {
	
	TreeNode root;
	
	public static void main(String[] args) {
		NumberRanking nr = new NumberRanking();
		int[] stream = {5, 1, 4, 4, 5, 9, 7, 13, 3};
		nr.buildTree(stream);
		nr.printResult(nr.getRank(1));
		nr.printResult(nr.getRank(3));
		nr.printResult(nr.getRank(4));
		nr.printResult(nr.getRank(5));
		nr.printResult(nr.getRank(13));
	}
	
	void buildTree (int[] stream) {
		for (int num : stream)
			track(num);
	}
	
	void track (int x) {
		if (root == null) {
			root = new TreeNode(x);
		}
		else {
			TreeNode node = new TreeNode(x);
			TreeNode curr = root;
			while (true) {
				if (node.value <= curr.value) { 
						curr.leftSubtreeSize++;
					if (curr.left != null)
						curr = curr.left;
					else {
						curr.left = node;
						break;
					}
				}
				else {
					if (curr.right != null)
						curr = curr.right;
					else {
						curr.right = node;
						break;
					}
				}
			}
		}
	}
	
	int getRank (int x) {
		int count = 0;
		TreeNode curr = root;
		while (curr != null) {
			if (x == curr.value)
				return count + curr.leftSubtreeSize;
			if (x > curr.value) {
				count += curr.leftSubtreeSize + 1;
				curr = curr.right;
			}
			else 
				curr = curr.left;
		}
		return -1;
	}
	
	void printResult (int num) {
		if (num != -1)
			System.out.println(num);
		else 
			System.out.println("not found");
	}
}
