class Solution {
    public int maxNumberOfBalloons(String text) {
        if (text == "" || text.length() < 7) {
            return 0;
        }
        int len = text.length();
        int[] arr = new int[26];
        for (int i=0; i<len; i++) {
            arr[text.charAt(i)-'a']++;
        }
        int min = Math.min(arr[0], arr[1]); //a b
        min = Math.min(min, arr[13]); // n
        min = Math.min(min, arr[11]/2); // l
        min = Math.min(min, arr[14]/2); // o
        return min;
    }
}