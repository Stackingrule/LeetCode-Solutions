class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
    	move(A.size(), A, B, C);
    }

    private void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
    	//只剩下1个盘子，直接从A到C，退出递归
    	if (n == 1) {
    		C.add(A.remove(A.size() - 1));
    		return;
    	}
    	// 实现A到C，分两步move：A到B，B到C。
    	move(n - 1, A, C, B);
    	C.add(A.remove(A.size() - 1));
    	move(n - 1, B, A, C);

    }
}