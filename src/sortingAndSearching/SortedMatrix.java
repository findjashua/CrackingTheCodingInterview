//11.6

package sortingAndSearching;

public class SortedMatrix {

	public static void main(String[] args) {
		SortedMatrix sm = new SortedMatrix();
		int[][] matrix = {{15, 20, 70, 85}, {20, 35, 80, 95}, {30, 55, 95, 105}, {40, 80, 100, 120}};
		int[] result = sm.search(matrix, 55);
		sm.printResult(result);
		result = sm.search(matrix, 85);
		sm.printResult(result);
		result = sm.search(matrix, 115);
		sm.printResult(result);
	}

	int[] search (int[][] matrix, int val) {
		int minrow = 0, mincol = 0, maxrow = matrix.length-1, maxcol = matrix[0].length-1;
		return search (matrix, val, minrow, maxrow, mincol, maxcol);
	}
	
	int[] search (int[][] matrix, int val, int minrow, int maxrow, int mincol, int maxcol) {
		if (maxrow - minrow > 1 || maxcol - mincol > 1) {
			int midrow = (minrow+maxrow)/2, midcol = (mincol+maxcol)/2;
			if (matrix[midrow][midcol] == val)
				return new int[] {midrow, midcol};
			if (val <= matrix[midrow][midcol])
				return search(matrix, val, minrow, midrow, mincol, midcol);
			else if (val >= matrix[midrow+1][midcol+1])
				return search(matrix, val, midrow+1, maxrow, midcol+1, maxcol);
			else {
				int[] temp = search(matrix, val, midrow+1, maxrow, mincol, midcol);
				if (temp == null)
					temp = search(matrix, val, minrow, midrow, midcol+1, maxcol);
				return temp;
			}
		}
		else {
			if (matrix[minrow][mincol] == val)
				return new int[] {minrow, mincol};
			if (matrix[minrow][maxcol] == val)
				return new int[] {minrow, maxcol};
			if (matrix[maxrow][mincol] == val)
				return new int[] {maxrow, mincol};
			if (matrix[maxrow][maxcol] == val)
				return new int[] {maxrow, maxcol};
		}
		return null;
	}
	
	void printResult (int[] result) {
		if (result == null)
			System.out.println("not found");
		else 
			System.out.println(result[0] + ", " + result[1]);
	}
}
