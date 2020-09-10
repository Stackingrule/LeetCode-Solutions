class Solution {
    public String sortString(String s) {
        int le = s.length();
        int[] arr = new int[26];
        for(int i = 0; i < le; i++){
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while(le > 0){
            for(int i = 0; i < 26; i++){
                if(arr[i] > 0){
                    sb.append((char) ('a' + i));
                    arr[i]--;
                    le--;
                } 
            }
    
            for(int i = 25; i >= 0; i--){           
                if(arr[i] > 0){
                    sb.append((char) ('a' + i));                
                    arr[i]--;
                    le--;
                } 
            }
        }
        return sb.toString();
    }
}