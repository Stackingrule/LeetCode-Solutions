public class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            result.add("");
            return result;
        }
        Queue<String> queue = new LinkedList<>();
        HashSet<String> hash = new HashSet<>();
        boolean found = false;
        queue.offer(s);
        while (!queue.isEmpty()) {
            String str = queue.poll();
            if (isValid(str)) {
                result.add(str);
                found = true;
            }
            if (found) {
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == ')') {
                    String sub = str.substring(0, i) + str.substring(i + 1);
                    if (!hash.contains(sub)) {
                        queue.offer(sub);
                        hash.add(sub);
                    }
                }
            }
        }
        return result;
    }
    
    public boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}