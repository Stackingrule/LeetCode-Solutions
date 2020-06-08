class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        	return false;
        }
        int left = 0, right = matrix.length;
        while (left < right) {
        	int mid = (left + right) / 2;
        	if (matrix[mid][0] == target) return true;
        	if (matrix[mid][0] <= target) left = mid + 1;
        	else right = mid;
        }
        int temp = (right > 0) ? (right - 1) : right;
        left = 0;
        right = matrix[temp].length;
        while (left < right) {
        	int mid = (left + right) / 2;
        	if (matrix[temp][mid] == target) return true;
        	if (matrix[temp][mid] <= target) left = mid + 1;
        	else right = mid;
        }
        return false;
    }
}