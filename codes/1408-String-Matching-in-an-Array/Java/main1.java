class Solution {
    public List<String> stringMatching(String[] words) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }
        HashSet<String> set = new HashSet<>();
        for (String i : words) {
            if (!set.contains(i)) {
                for (String j : words) {
                    if (j.contains(i) && !j.equals(i)) {
                        set.add(i);
                        break;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
