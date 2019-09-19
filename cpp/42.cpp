/*
    暴力解法
    时间复杂度：O(N^2)
    空间复杂度：O(1)

 */
class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if(n <= 2)
            return 0;
        int ans = 0;
        for(int i = 1; i < n - 1; i++) {
            int l_max = height[i], r_max = height[i];
            for(int r = i + 1; r < n; r++) 
                r_max = max(r_max, height[r]);
            
            for(int l = i - 1; l >= 0; l--) 
                l_max = max(l_max, height[l]);
            
            ans += min(l_max, r_max) - height[i];
        }
        return ans;
        
    }
};


/*
    备忘录解法优化
    时间复杂度：O(N)
    空间复杂度：O(N)
    l_max[i]表示i左边最高柱子的高度
    r_max[i]表示i右边最高柱子的高度
 */
class Solution {
public:
    int trap(vector<int> &height) {
        int n = height.size();
        int ans = 0;
        if(n <= 2)
            return 0;
        vector<int> l_max(n);
        vector<int> r_max(n);
        l_max[0] = height[0], r_max[n-1] = height[n-1];
        for(int i = 1; i < n; i++)
            l_max[i] = max(height[i], l_max[i-1]);
        for(int i = n - 2; i >= 0; i--)
            r_max[i] = max(height[i], r_max[i+1]);
        for(int i = 1; i < n - 1; i++)
            ans += min(l_max[i], r_max[i]) - height[i];
        return ans;
    }
};

/*
    双指针
    时间复杂度：O(N)
    空间复杂度：O(1)
    l_max表示height[0···left]中最高柱子的高度
    r_max表示height[right···end]中最高柱子的高度

 */

class Solution {
public:
    int trap(vector<int> &height) {
        int n = height.size();
        int ans = 0;
        int left = 0, right = n - 1;
        int l_max = height[0];
        int r_max = height[n-1];
        if(n <= 2)
            return 0;

        while(left  <= right) {
            l_max = max(l_max, height[left]);
            r_max = max(r_max, height[right]);

            if(l_max < r_max) {
                ans += l_max - height[left];
                left++;
            }
            else {
                ans += r_max - height[right];
                right--;
            }
        }
        return ans;
    }
};