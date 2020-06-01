class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        dfs(res, "", n, n);
        return res;
    }

    /*
	* left and right represents the remaining number of ( and ) that need to be added. 
	* When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops. 
	*/
    private void dfs(List<String> res, String s, int left, int right) {
    	if (left > right) return;
    	if (left == 0 && right == 0) {
    		res.add(s);
    		return;
    	}
    	if (left > 0) {
    		dfs(res, s + "(", left - 1, right);
    	}
    	if (right > 0) {
    		dfs(res, s + ")", left, right - 1);
    	}
    }
}