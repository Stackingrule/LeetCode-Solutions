class Solution {
    public int reversePairs(int[] nums) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            res += insert(list, nums[i]);
        }
        return res;
    }

    public int insert(List<Integer> list, int num) {
        int res = 0;
        if (list.size() == 0) {
            list.add(num);
            return res;
        }
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list.get(mid) > num * 2L) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        res = list.size() - start;

        start = 0;
        end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list.get(mid) == num) {
                start = mid;
                break;
            }
            if (list.get(mid) > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        list.add(start, num);
        return res;
    }
}