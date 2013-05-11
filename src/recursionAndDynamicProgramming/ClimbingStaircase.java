//9.1

package recursionAndDynamicProgramming;

public class ClimbingStaircase {
	
	public static void main (String[] args) {
		ClimbingStaircase cs = new ClimbingStaircase();
		System.out.println(cs.numWays(35));
	}
	
	int numWays(int steps) {
		int[] ways = new int[steps];
		return numWays(steps, ways);
	}
	
	int numWays(int steps, int[] ways) {
		ways[0] = 1;
		ways[1] = 2;
		ways[2] = 4;
		for (int i=3; i < steps; i++)
			ways[i] = ways[i-3] + ways[i-2] + ways[i-1];
		return ways[steps-1];
	}

}
