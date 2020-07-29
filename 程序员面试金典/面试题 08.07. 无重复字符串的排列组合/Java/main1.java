class Solution {
    public String[] permutation(String S) {
        List<String> list = new ArrayList<>();
        list.add(S);
        for (int i = 0; i < S.length() - 1; i++) {
            int size = list.size();
            for (int j = i + 1; j < S.length(); j++) {
                for (int index = 0; index < size; index++) {
                    list.add(swap(list.get(index), i, j));
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
    //交换位置
    private String swap(String s, int pos1, int pos2) {
        char[] chars = s.toCharArray();
        chars[pos1] ^= chars[pos2];
        chars[pos2] ^= chars[pos1];
        chars[pos1] ^= chars[pos2];
        return new String(chars);
    }
}