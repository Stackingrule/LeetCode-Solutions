class Solution {
    public String reformat(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                characters.add(c);
            }
        }
        if (Math.abs(digits.size() - characters.size()) >= 2) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        boolean digit = (digits.size() >= characters.size() ? true : false);
        for (int i = 0; i < s.length(); i++) {
            if (digit) {
                sb.append(digits.remove(0));
            } else {
                sb.append(characters.remove(0));
            }
            digit = !digit;
        }
        return sb.toString();
    }
}