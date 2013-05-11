package treesAndGraphs;

public class ArrayToTree {

	public static void main(String[] args) {

	}

	TreeNode makeTree(int[] arr, int start, int end) {
		if(start > end)
			return null;
		int mid = (start+end)/2;
		TreeNode rootNode = new TreeNode(arr[mid]);
		rootNode.left = makeTree(arr, start, mid-1);
		rootNode.right = makeTree(arr, mid+1, end);
		return rootNode;
	}
}
