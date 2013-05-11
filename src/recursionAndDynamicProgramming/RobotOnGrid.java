//9.2

package recursionAndDynamicProgramming;

public class RobotOnGrid {

	public static void main(String[] args) {
		RobotOnGrid rog = new RobotOnGrid();
		int[][] grid = new int[3][3];
		grid[1][1] = -1;
		System.out.println(rog.numWays(grid, 2, 2));
	}
	
	int numWays(int[][] grid, int x, int y) {
		for (int i=0; i<=x; i++) {
			if (grid[i][0] != -1)
				grid[i][0] = 1;
		}
			
		for (int j=0; j<=y; j++) {
			if (grid[0][j] != -1)
				grid[0][j] = 1;
		}
		for (int i=1; i<=x; i++) {
			for (int j=1; j<=y; j++) {
				if (grid[i][j] != -1) {
					if (grid[i-1][j] != -1)
						grid[i][j] = grid[i-1][j]; 
					if (grid[i][j-1] != -1)
						grid[i][j] += grid[i][j-1];
				}
			}
		}
		return grid[x][y];
	}
}
