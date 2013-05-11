package stacksAndQueues;

import java.util.*;

public class StackWithMinFunction extends Stack<Integer> {
	Stack<Integer> minVals;
	Stack<Integer> index;
	
	public StackWithMinFunction() {
		minVals = new Stack<Integer>();
	}
	
	void push(int val) {
		super.push(val);
		if(val < min()) {
			minVals.push(val);
			index.push(super.size());
		}
	}
	
	public Integer pop() {
		int val = super.pop();
		if (minVals.peek() == val && index.peek() == super.size()) {
			minVals.pop();
			index.pop();
		}
		return val;
	}
	
	int min() {
		return minVals.peek();
	}
}
