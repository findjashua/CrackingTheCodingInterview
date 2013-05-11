package treesAndGraphs;

import java.util.*;

public class GraphTraversals {
	
	static GraphNode breadthFirst(GraphNode graph, int val) {
		if(graph.condition() == true)
			return graph;
		graph.visited = true;
		LinkedList<GraphNode> q = new LinkedList<GraphNode>();
		q.add(graph);
		while (q.size() > 0) {
			GraphNode node = q.remove();
			for (GraphNode neighbor : node.neighbors) {
				if(neighbor.visited == false) {
					if(neighbor.condition() == true)
						return neighbor;
					neighbor.visited = true;
					q.add(neighbor);
				}
			}
		}
		return null;
	}

	static GraphNode depthFirst(GraphNode graph, int val) {
		if(graph.condition() == true)
			return graph;
		LinkedList<GraphNode> stack = new LinkedList<GraphNode>();
		graph.visited = true;
		stack.push(graph);
		while (stack.size() > 0) {
			GraphNode node = stack.pop();
			for (GraphNode neighbor : node.neighbors) {
				if (neighbor.visited == false) {
					if (neighbor.condition() == true)
						return neighbor;
					neighbor.visited = true;
					stack.push(neighbor);
				}
			}
		}
		return null;
	}
	
}
