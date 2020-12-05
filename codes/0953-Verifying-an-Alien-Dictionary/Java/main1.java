 class Solution {
     public boolean isAlienSorted(String[] words, String order) {
         if(words == null || words.length == 0 || order == null || order.length() == 0){
             return true;
         }
 
         int [] map = new int[26];
         for(int i = 0; i<order.length(); i++){
             map[order.charAt(i)-'a'] = i;
         }
 
         for(int i = 1; i<words.length; i++){
             if(isBigger(words[i-1], words[i], map)){
                 return false;
             }
         }
 
         return true;
     }
 
     private boolean isBigger(String s1, String s2, int [] map){
         int j = 0;
         while(j < s1.length() && j < s2.length()){
             if(s1.charAt(j) != s2.charAt(j)){
                 return map[s1.charAt(j) - 'a'] > map[s2.charAt(j) - 'a'];
             }
 
             j++;
         }
 
         return s1.length() > s2.length();
     }
 }