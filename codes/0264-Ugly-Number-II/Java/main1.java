class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while (res.size() < n) {
        	int m2 = res.get(i2) * 2, m3 = res.get(i3) * 3, m5 = res.get(i5) * 5;
        	int mn = Math.min(m2, Math.min(m3, m5));
        	if (mn == m2) ++i2;
        	if (mn == m3) ++i3;
        	if (mn == m5) ++i5;
        	res.add(mn);
        }
        return res.get(res.size() - 1);
    }
}