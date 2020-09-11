class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String a : A) {
            char[] even = new char[(a.length() + 1) / 2];
            char[] odd = new char[(a.length() + 1) / 2];
            for (int  i = 0; i < a.length(); ++i) {
                if (i % 2 == 0) even[i / 2] = a.charAt(i);
                else odd[i / 2] = a.charAt(i);
            }
            Arrays.sort(even);
            Arrays.sort(odd);
            String s = new String(even) + new String(odd);
            set.add(s);
        }
        return set.size();
    }
}