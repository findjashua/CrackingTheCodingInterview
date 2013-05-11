package treesAndGraphs;

public abstract class Node {
	public int value;
	public boolean visited;
	
	public Node(int val) {
		this.value = val;
	}
	
	boolean condition() {
		return false;
	}
}
