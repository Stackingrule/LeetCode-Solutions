class Solution {
    public String findLongestWord(String s, List<String> d) {
        if(s == null || d == null || d.size() == 0){
            return "";
        }

        String res = "";
        for(String word : d){
            int i = 0;
            for(char c : s.toCharArray()){
                if(i<word.length() && c == word.charAt(i)){
                    i++;
                }
            }

            if(i == word.length()){
                if(res.length() < word.length()){
                    res = word;
                }else if(res.length() == word.length() && res.compareTo(word)>0){
                    res = word;
                }
            }
        }

        return res;
    }
}