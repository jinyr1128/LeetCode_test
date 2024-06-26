class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int right = m * n - 1;
        
        while (left <= right) {
            int midIdx = left + (right - left) / 2;
            int midVal = matrix[midIdx / n][midIdx % n];
            
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = midIdx + 1;
            } else {
                right = midIdx - 1;
            }
        }
        
        return false;
    }
}
