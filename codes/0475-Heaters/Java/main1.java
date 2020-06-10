class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int n = heaters.length, j = 0, res = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for (int i = 0; i < houses.length; ++i) {
        	int cur = houses[i];
        	while (j < n - 1 && (Math.abs(heaters[j + 1] - cur) <= Math.abs(heaters[j] - cur))) {
        		++j;
        	}
        	res = Math.max(res, Math.abs(heaters[j] - cur));
        }

        return res;
    }
}