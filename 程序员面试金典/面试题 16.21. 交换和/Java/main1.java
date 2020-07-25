class Solution {
    public int[] findSwapValues(int[] array1, int[] array2) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
			map.put(array2[i], 1);
		}
		int diff = (sum2 - sum1);
		if (diff % 2 != 0)
			return new int[]{};

		for (int i = 0; i < array1.length; i++) {
			// 如果arr1[i]+arr2[xxx]== diff就好了
			System.out.println((diff + 2 * array1[i]) / 2);
			if (map.get((diff + 2 * array1[i]) / 2) != null) {
				return new int[]{array1[i], (diff + 2 * array1[i]) / 2};
			}
		}
		return new int[]{};
    }
}