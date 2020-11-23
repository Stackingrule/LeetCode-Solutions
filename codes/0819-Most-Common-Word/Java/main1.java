class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W+");

        // add banned words to set
        HashSet<String> set = new HashSet<>();
        for (String word : banned) {
            set.add(word);
        }

        // add paragraph words to hashmap
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // get the most freq word
        int max = 0;
        String res = "";
        for (String str : map.keySet()) {
            if (map.get(str) > max) {
                max = map.get(str);
                res = str;
            }
        }
        return res;
    }
}