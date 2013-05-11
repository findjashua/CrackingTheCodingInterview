//1.6

package arraysAndStrings;

public class RotateImage {

	public static void main(String[] args) {
		RotateImage ri = new RotateImage();
		int[][] matrix = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}}; 
		Utils.printMatrix(matrix);
		Utils.printMatrix(ri.rotateImage(matrix));
	}
	
	int[][] rotateImage(int[][] matrix) {
		int n = matrix.length;
		int left = 0, top = 0, right = n-1, bottom = n-1;
		while (top < bottom && left < right) 
			rotateLayer(matrix, left++, right--, top++, bottom--);
		return matrix;
	}

	void rotateLayer(int[][] matrix, int left, int right, int top, int bottom) {
		for(int i=left; i<=right; i++)
			rotatePixels(matrix, i, left, right, top, bottom);
	}
	
	void rotatePixels(int[][] matrix, int i, int left, int right, int top, int bottom) {
		int temp = matrix[i][right];
		matrix[i][right] = matrix[top][i];
		matrix[top][i] = matrix[bottom-i][left];
		matrix[bottom-i][left] = matrix[bottom][right-i];
		matrix[bottom][right-i] = temp;
		//Utils.printMatrix(matrix);
	}
}
