/**
* 非字典序
*/
class Solution {

	Set<String> list = new HashSet<>();
	Set<Integer> set = new HashSet<>();

    public String[] permutation(String s) {
    	char[] c = s.toCharArray();
    	permutate(c.length, c, "");

    	String[] res = list.toArray(new String[list.size()]);
    	return res;
    }

    public void permutate(int size, char[] c, String curStr) {
    	if (curStr.length == size) {
    		list.add(curStr);
    		return;
    	}
    	for (int i = 0; i < c.length; ++i) {
    		if (!set.contains(i)) {
    			set.add(i);
    			str += c[i];
    			permutate(size, c, curStr);
    			curStr = curStr.substring(0, curStr.length() - 1);
    			set.remove(i);
    		}
    	}
    }
}