class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        if (digits.length() == 0) {
        	return res;
        }
        String[] dic = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for (int i = 0; i < digits.length(); ++i) {
        	int index = Character.getNumericValue(digits.charAt(i));
        	while (res.peek().length() == i) {
        		String temp = res.remove();
        		for (Character c : dic[index].toCharArray()) {
        			res.add(temp + c);
        		}
        	}
        }
        return res;
    }
}