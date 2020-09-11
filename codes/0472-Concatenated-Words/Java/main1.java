class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        if (words == null || words.length == 0) {return Collections.EMPTY_LIST;}
        Arrays.sort(words, Comparator.comparing(String::length));
        Set<String> wordSet = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (find(wordSet, word)){
                result.add(word);
            }
        }
        return result;
    }
    
    public boolean find(Set<String> wordSet, String word) {
        if (wordSet.isEmpty()) {
            wordSet.add(word);
            return false;
        }
        boolean[] dp = new boolean[word.length()+1];
        dp[0] = true;
        for (int i = 1; i<=word.length() ; i++) {
            for (int j = 0 ; j<i ; j++) {
                if (!dp[j]){ continue;}
                if (wordSet.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        wordSet.add(word);
        return dp[word.length()];
    }
}