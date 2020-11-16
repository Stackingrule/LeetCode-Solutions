class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        char[] chars = address.toCharArray();
        for (char c : chars) {
            ans.append(c == '.' ? "[.]" : c);
        }
        return ans.toString();
    }
}