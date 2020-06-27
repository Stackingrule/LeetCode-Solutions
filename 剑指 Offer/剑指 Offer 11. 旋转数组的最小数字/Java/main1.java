class Solution {
    public int minArray(int[] numbers) {
    	int left = 0, right = numbers.length - 1;
    	while (left < right) {
    		int mid = left + (right - left) / 2;
    		if (numbers[mid] > numbers[right]) {
    			left = mid + 1;
    		}
    		else if (numbers[mid] == numbers[right]) {
    			right = right - 1;
    		}
    		else {
    			right = mid;
    		}
    	}
    	return numbers[left];
    }
}