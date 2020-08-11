package leetcode54;

import java.util.ArrayList;
import java.util.List;

public class FindSpiralMatrixFunction {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        // If its empty or null, return empty list
        if(matrix.length == 0 || matrix == null){
            return result;
        }
        
        // Shortcut for length n x m
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Index of first element to last element of matrix.length
        int up = 0;
        int down = n - 1;
        
        // Index of first element to last element of matrix[0].length
        int left = 0;
        int right = m - 1;
        
        // Since the result size can't be bigger than n * m 
        while(result.size() < n * m){
            // Go through the all the elements in the first row
            for(int i = left; i <= right && result.size() < n * m; i++){
                result.add(matrix[up][i]);
            }
            
            // Go through the right most column everything in between up and down
            for(int j = up + 1; j <= down - 1 && result.size() < n * m; j++){
                result.add(matrix[j][right]);
            }
            
            // Go through the last row, from end to beginning
            for(int k = right; k >= left && result.size() < n * m; k--){
                result.add(matrix[down][k]);
            }
            
            // Go through the left most column, everything in between up and down
            for(int l = down - 1; l >= up + 1 && result.size() < n * m; l--){
                result.add(matrix[l][left]);
            }
            
            left++;
            right--;
            up++;
            down--;
        }
        
        return result;
    }
}
