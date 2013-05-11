//1.7

package arraysAndStrings;

import java.util.*;

public class ZeroRowsAndCols {

	public static void main(String[] args) {
		ZeroRowsAndCols zrc = new ZeroRowsAndCols();
		int[][] matrix = {{0, 1, 2, 3}, {3, 4, 5, 6}, {6, 7, 8, 9}};
		Utils.printMatrix(matrix);
		zrc.zeroOutMatrix(matrix);
		Utils.printMatrix(matrix);
	}
	
	void zeroOutMatrix(int[][] matrix) {
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> cols = new HashSet<Integer>();
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				if (matrix[i][j] ==0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		Iterator<Integer> iter = rows.iterator();
		while (iter.hasNext()) 
			zeroOutRow(matrix, iter.next());
		iter = cols.iterator();
		while (iter.hasNext())
			zeroOutCol(matrix, iter.next());
	}
	
	void zeroOutRow(int[][] matrix, int row) {
		for (int i=0; i < matrix[0].length; i++)
			matrix[row][i] = 0;
	}
	
	void zeroOutCol(int[][] matrix, int col) {
		for (int i=0; i<matrix.length; i++)
			matrix[i][col] = 0;
	}
}
