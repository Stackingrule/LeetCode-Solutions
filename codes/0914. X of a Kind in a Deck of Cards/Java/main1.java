class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1)
            return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            Integer temp = map.get(deck[i]);
            if (temp == null) {
                map.put(deck[i], 1);
            } else {
                map.put(deck[i], temp + 1);
            }
        }
        int min = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (min < 0) {
                min = entry.getValue();
            } else {
                min = gcd(min, entry.getValue());
            }
            if (min < 2)
                return false;
        }
        return true;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }}