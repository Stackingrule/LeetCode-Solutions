public class Solution {
    public int triangleNumber(int[] nums) {
        int result = 0;
        if (nums.length < 3) return result;
        
        Arrays.sort(nums);
 
        for (int i = 2; i < nums.length; i++) {//令nums[i]为最长边
            int left = 0, right = i - 1;//nums[right]为第二长边,nums[left]是最短边
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {//当前已经能够满足短+短>长
                    result += (right - left);//那么[left,right)范围内的数作为最短边仍然能满足
                    right--;//改变第二长边
                }
                else {
                    left++;//当前不能满足短+短>长，增加最短边
                }
            }
        }
        
        return result;
    }
}