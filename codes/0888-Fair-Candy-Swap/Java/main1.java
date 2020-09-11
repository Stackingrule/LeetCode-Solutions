class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] result = new int[2];
        // 存储A中的元素（换成B也行）
        Set<Integer> set = new HashSet<Integer>();
        int sumA = 0;
        for (int a : A) {
            sumA += a;
            set.add(a);
        }
        int sumB = 0;
        for (int b : B) {
            sumB += b;
        }
        // 两人糖果总量之差的平均数
        int num = (sumA-sumB)/2;
        // 遍历B中元素，加上差值平均数去另外一个数组里匹配，
        // 能匹配上，表明遇到了需要交换的元素。
        for (int b : B) {
            if (set.contains(b+num)) {
                return new int[]{b+num, b};
            }
        }
        return result;
    }
}