class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0 | denominator == 0) return "0";
        StringBuilder result = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) result.append("-");
        long up = Math.abs(Long.valueOf(numerator)), down = Math.abs(Long.valueOf(denominator));
        result.append(String.valueOf(up / down));
        long remain = up % down;
        if (remain == 0) return result.toString();
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remain != 0) {
            if (map.containsKey(remain)) {
                result.insert(map.get(remain), "(");
                result.append(")");
                break;
            }
            map.put(remain, result.length());
            remain *= 10;
            result.append(String.valueOf(remain / down));
            remain %= down;
        }
        return result.toString();
    }
}