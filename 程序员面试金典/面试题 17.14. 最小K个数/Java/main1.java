import java.util.PriorityQueue;

class Solution {
    public int[] smallestK(int[] arr, int k) {
        if (arr == null || arr.length == 0) return new int[k];
        int[] res = new int[k];
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int a : arr) {
            q.offer(a);
        }

        for (int i = 0; i < k; ++i) {
            res[i] = q.poll();
        }
        return res;
    }
}