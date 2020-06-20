class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        set.add(get(p1, p2));
        set.add(get(p2, p3));
        set.add(get(p3, p4));
        set.add(get(p4, p1));
        set.add(get(p1, p3));
        set.add(get(p2, p4));
        if (set.contains(0) || set.size() != 2) {
        	return false;
        }

        return true;
    }

    private int get(int[] p1, int[] p2) {
    	return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }
}