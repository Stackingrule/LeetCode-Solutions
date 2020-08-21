class Solution
{
public:
    vector<int> sortArray(vector<int> &nums)
    {
        quickSort(nums, 0, (int)nums.size() - 1);
        return nums;
    }
    void quickSort(vector<int> &nums, int start, int end)
    {
        if (start >= end)
            return;
        int pivot = nums[start], i = start + 1, j = end;
        while (i <= j)
        {
            if (nums[i] > pivot && nums[j] < pivot)
            {
                swap(nums[i++], nums[j--]);
            }
            if (nums[i] <= pivot)
                ++i;
            if (nums[j] >= pivot)
                --j;
        }
        swap(nums[start], nums[j]);
        quickSort(nums, start, j - 1);
        quickSort(nums, j + 1, end);
    }
};
