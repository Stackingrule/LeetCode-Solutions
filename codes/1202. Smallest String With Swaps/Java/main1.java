class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        ArrayList<HashSet<Integer>> groups = new ArrayList<>();
        UnionFind uf = new UnionFind(s.length());
        for (List<Integer> l : pairs) {
            int x = l.get(0), y = l.get(1);
            uf.union(x, y);
        }
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int root = uf.find(i);
            ArrayList<Integer> arr = map.getOrDefault(root, new ArrayList<>());
            arr.add(i);
            map.put(root, arr);
        }

        StringBuilder sb = new StringBuilder(s);
        for (Integer root : map.keySet()) {
            ArrayList<Integer> indexes = map.get(root);
            ArrayList<Character> arr = new ArrayList<>();
            for (int j : indexes) {
                arr.add(s.charAt(j));
            }
            Collections.sort(arr);
            Collections.sort(indexes);
            int k = 0;
            for (int j : indexes) {
                sb.setCharAt(j, arr.get(k++));
            }
        }
        return sb.toString();
    }

    class UnionFind {
        int[] arr;

        public UnionFind(int n) {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
        }

        public int find(int x) {
            if (arr[x] != x)
                arr[x] = find(arr[x]);
            return arr[x];
        }

        public void union(int x, int y) {
            int a = find(x), b = find(y);
            if (a != b) {
                arr[b] = a;
            }
        }
    }
}