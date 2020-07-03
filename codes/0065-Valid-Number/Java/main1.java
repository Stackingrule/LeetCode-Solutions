
public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numberSeen = true;
            } else if (s.charAt(i) == '.'){
                if (eSeen || pointSeen){
                    return false;
                }
                pointSeen = true;
            } else if (s.charAt(i) == 'e'){
                if (eSeen || !numberSeen){
                    return false;
                }
                eSeen = true;
                numberSeen = false;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+'){
                if (i != 0 && s.charAt(i - 1) != 'e' ){
                    return false;
                }
            } else {
                return false;
            }
        }
        return numberSeen;
    }
}
