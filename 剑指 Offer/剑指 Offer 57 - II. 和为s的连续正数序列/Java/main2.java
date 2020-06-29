import java.util.List;

class Solution {
    public int[][] findContinuousSequence(int target) {
    	List<int[]> res = new ArrayList<>();
    	int left = 1, right = 2;
		int sum = left + right;
		while (left <= target / 2) {
			if (sum == target) {
				int[] arr = new int[right - left + 1];
				for (int k = 0; k < arr.length; k++) {
					arr[k] = left + k;
				}
				res.add(arr);
				sum -= left++;
			}
			else if (sum > target) {
				sum -= left++;
			}
			else {
				sum += ++right;
			}
		}
		return res.toArray(new int[res.size()][]);
    }
}