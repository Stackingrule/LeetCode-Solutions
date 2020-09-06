class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] res = new int[n];
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for (int i = 0; i < n; ++i) {
            q.offer(i);
        }
        for (int i = 0; i < n; ++i) {
            int t = q.poll();
            res[t] = deck[i];
            if (q.peek() != null) {
                q.offer(q.poll());
            }
        }
        return res;
    }
}