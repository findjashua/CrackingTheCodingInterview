package treesAndGraphs;

import java.util.*;

public class GraphNode extends Node {
	LinkedList<GraphNode> neighbors;
	
	public GraphNode(int val) {
		super(val);
	}
}
