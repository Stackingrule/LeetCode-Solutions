class Solution {
    public String reverseWords(String s) {
      String[] str = s.split(" ");
      String res = "";
      for (int i = str.length - 1; i >= 0; --i) {
        if (!str[i].equals("")) {
          res += str[i] + " ";
        }
      }
      return res.trim();
    }
}