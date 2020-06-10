/*
* 题目就可以转换为分别求出以每个字符(a-z)为结束字符的最长连续字符串就行了
*/
class Solution {
    public int findSubstringInWraproundString(String p) {
		// count[i] is the maximum unique substring end with ith letter.
		// 0 - 'a', 1 - 'b', ..., 25 - 'z'.
		int[] count = new int[26];

		// store longest contiguous substring ends at current position.
		int maxLengthCur = 0;
		for (int i = 0; i < p.length(); ++i) {
			if (i > 0 && ((p.charAt(i) == p.charAt(i - 1) + 1) || (p.charAt(i - 1) - p.charAt(i) == 25))) {
				++maxLengthCur;
			}
			else {
				maxLengthCur = 1;
			}
			int index = p.charAt(i) - 'a';
			count[index] = Math.max(count[index], maxLengthCur);
		}

		int sum = 0;
		for (int i = 0; i < 26; ++i) {
			sum += count[i];
		}

		return sum;
    }
}