class Solution
{
public:
	int reverseBits(int num)
	{
		uint32_t tmp = num;
		int ans = 0;
		int cur = 0, pre = 0;
		while (tmp != 0)
		{
			if (tmp & 1)
			{
				cur++;
			}
			else
			{
				ans = max(ans, cur + pre + 1);
				pre = cur;
				cur = 0;
			}
			tmp >>= 1;
		}
		ans = cur == 32 ? cur : max(ans, cur + pre + 1);
		return ans;
	}
};