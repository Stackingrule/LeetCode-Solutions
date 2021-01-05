class Solution {
    public ArrayList<String> wordBreak(String s, List<String> wordDict) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        Set<String> dict = new HashSet<>(wordDict);

        return wordBreakHelper(s, dict, map);
    }

    // divide and conquer
    private ArrayList<String> wordBreakHelper(String s, Set<String> dict, Map<String, ArrayList<String>> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        ArrayList<String> newList = new ArrayList<>();
        if (dict.contains(s)) {
            newList.add(s);
        }

        for (int i = 1; i < s.length(); i++) {
            String possibleWord = s.substring(0, i);
            if (dict.contains(possibleWord)) {
                ArrayList<String> wordsList = wordBreakHelper(s.substring(i), dict, map);
                for (String words : wordsList) {
                    newList.add(possibleWord + " " + words);
                }
            }
        }

        map.put(s, newList);
        return newList;
    }
}