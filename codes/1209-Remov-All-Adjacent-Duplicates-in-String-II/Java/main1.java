class Solution {
    public String removeDuplicates(String s, int k) {
        if(s == null || s.length() == 0){
            return s;
        }

        if(k == 1){
            return "";
        }

        boolean changed = true;
        while(changed){
            changed = false;
            StringBuilder sb = new StringBuilder();

            int i = 0;
            while(i < s.length()){
                if(i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)){
                    sb.append(s.charAt(i));
                    i++;
                }else{
                    int j = i + 1;
                    int count = 1;
                    while(j < s.length() && s.charAt(j) == s.charAt(i) && count < k){
                        j++;
                        count++;
                    }

                    if(count < k){
                        sb.append(s.substring(i, j));
                    }else{
                        changed = true;
                    }

                    i = j;
                }
            }

            s = sb.toString();
        }

        return s;
    }
}