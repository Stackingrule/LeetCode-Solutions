class Solution {
    public String toGoatLatin(String S) {
        if(S == null || S.length() == 0){
            return S;
        }

        HashSet<Character> vows = new HashSet<>();
        for(char c : "aeiouAEIOU".toCharArray()){
            vows.add(c);
        }

        StringBuilder sb = new StringBuilder();
        String [] words = S.trim().split("\\s+");
        for(int i = 0; i<words.length; i++){
            String word = words[i];
            char first = word.charAt(0);
            if(!vows.contains(first)){
                word = word.substring(1)+first;
            }

            word = word + "ma";
            for(int k = 0; k<=i; k++){
                word = word + "a";
            }

            sb.append(word + " ");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}