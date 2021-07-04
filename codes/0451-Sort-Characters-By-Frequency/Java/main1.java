class Solution {
    public String frequencySort(String s) {
        if (s == null || s.length() <= 2)
            return s;
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        PriorityQueue<Character> heap = new PriorityQueue<Character>(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return map.get(c2) - map.get(c1);
            }
        });
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        for (Character key : map.keySet())
            heap.offer(key);

        while (!heap.isEmpty()) {
            Character c = heap.remove();
            int cnt = map.get(c);
            while (cnt > 0) {
                ans.append(c);
                --cnt;
            }
        }

        return ans.toString();
    }
}