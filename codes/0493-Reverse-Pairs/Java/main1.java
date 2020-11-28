public class Solution
{
    public int ReversePairs(int[] nums)
    {
        var tempNums = nums.Select(c => (long)c).ToArray();
        return MergeSortAndCount(tempNums, 0, nums.Length - 1);
    }
 
    private void Merge(long[] nums, int start, int mid, int end)
    {
        var n1 = mid - start + 1;
        var n2 = end - mid;
 
        var left = new long[n1];
        var right = new long[n2];
 
        var i = 0;
        var j = 0;
 
        for (i = 0; i < n1; i++)
        {
            left[i] = nums[start + i];
        }
 
        for (j = 0; j < n2; j++)
        {
            right[j] = nums[mid + 1 + j];
        }
 
        i = 0;
        j = 0;
 
        for (int k = start; k <= end; k++)
        {
            if (j >= n2 || (i < n1 && left[i] <= right[j]))
            {
                nums[k] = left[i];
                i++;
            }
            else
            {
                nums[k] = right[j];
                j++;
            }
        }
    }
 
    private int MergeSortAndCount(long[] nums, int start, int end)
    {
        if (start < end)
        {
            int mid = (start + end) / 2;
            int count = MergeSortAndCount(nums, start, mid) + MergeSortAndCount(nums, mid + 1, end);
 
            int j = mid + 1;
 
            for (int i = start; i <= mid; i++)
            {
                while (j <= end && nums[i] > (nums[j] * 2))
                {
                    j++;
                }
 
                count += j - (mid + 1);
            }
 
            Merge(nums, start, mid, end);
            return count;
        }
        else
        {
            return 0;
        }
    }
}