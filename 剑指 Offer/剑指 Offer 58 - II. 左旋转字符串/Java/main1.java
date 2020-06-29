class Solution {
    public String reverseLeftWords(String s, int n) {
    	char[] chars = s.toCharArray();
    	reverse(chars, 0, n - 1);
    	reverse(chars, n, chars.length - 1);
    	reverse(chars, 0, chars.length - 1);
    	return new String(chars);
    }

    private void reverse(char[] ch, int left, int right) {
    	while (left < right) {
    		char t = ch[right];
    		ch[right] = ch[left];
    		ch[left] = t;
    		++left;
    		--right;
    	}
    }
}