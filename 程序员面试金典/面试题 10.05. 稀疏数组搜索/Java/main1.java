class Solution {
    public int findString(String[] words, String s) {
        int i = 0, j = words.length - 1;
        boolean flag = true;
        while(i < j){
            int m = (i + j)/2;
            if("".equals(words[i])){
                i++;
                continue;
            }
            if("".equals(words[j])){
                j--;
                continue;
            }
            while("".equals(words[m])){
                m = flag? m+1:m -1;
            }
            if(words[m].compareTo(s) < 0){
                 i = m +1;
                 flag = true;
            }else if(words[m].compareTo(s) > 0){
                j = m;
                flag = false;
            }else{
                return m;
            }
        }
        return s.equals(words[i])?i:-1;
    }
}