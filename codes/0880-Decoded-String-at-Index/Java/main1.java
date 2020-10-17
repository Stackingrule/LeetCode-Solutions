class Solution {
    public String decodeAtIndex(String S, int K) {

        if (S == null || S.trim().length() == 0 || K <= 0){
            return null;
        }

        long count = 0;
        int index = 0;
        for (index = 0; index< S.length(); index++){

            char c = S.charAt(index);
            if (c>='a'&&c<='z'){
                count++;
            } else {
                int d = c - 0x30;
                count *= d;
            }

            if (count>=K){
                break;
            }
        }


        return helper(S, index, K, count);
    }

    private String helper(String S, int index, long K, long count){

        char c = S.charAt(index);
        if (c >='a'&& c<='z'){

            if (K == count){

                return String.valueOf(c);
            }

            count -= 1;
            index -= 1;
        } else {

            int d = c - 0x30;
            count /= d;
            K = K%count == 0?count: K%count;
            index -= 1;
        }

        return helper(S, index, K, count);
    }
}