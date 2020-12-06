class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        A += " " + B;
        String words[] = A.split(" ");
        Map<String, Integer> word_times = new HashMap<>();
        for (String word : words) word_times.put(word, word_times.getOrDefault(word, 0) + 1);
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : word_times.entrySet()) if (entry.getValue() < 2) result.add(entry.getKey());
        return result.toArray(new String[result.size()]);
    }
}