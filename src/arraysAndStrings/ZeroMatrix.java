package arraysAndStrings;

import java.util.*;

public class ZeroMatrix {

	public static void main(String[] args) {
		ZeroMatrix zm = new ZeroMatrix();
		int[][] matrix = {{1,0,1},{1,1,0},{1,1,1}};
		Utils.printMatrix(matrix);
		Utils.printMatrix(zm.zeroOut(matrix));
	}
	
	int[][] zeroOut(int[][] matrix) {
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> cols = new HashSet<Integer>();
		int n = matrix.length;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if(matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		Iterator<Integer> iter = rows.iterator();
		while (iter.hasNext()) {
			int row = iter.next();
			for (int i=0; i<n; i++) {
				matrix[row][i] = 0;
			}
		}
		iter = cols.iterator();
		while (iter.hasNext()) {
			int col = iter.next();
			for (int i=0; i<n; i++) {
				matrix[i][col] = 0;
			}
		}		
		return matrix;
	}
}
