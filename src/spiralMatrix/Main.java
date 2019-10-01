package spiralMatrix;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println("Matrix: " + Arrays.deepToString(matrix));
		
		FindSpiralMatrixFunction solution = new FindSpiralMatrixFunction();
		
		System.out.println("Spiral matrix: " + solution.spiralOrder(matrix));
	}
}
