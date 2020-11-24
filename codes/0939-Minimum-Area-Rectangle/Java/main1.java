class Solution {
    public int minAreaRect(int[][] points) {
        int res = Integer.MAX_VALUE;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int[] point : points) {
            if (!map.containsKey(point[0])) {
                map.put(point[0], new HashSet<>());
            }
            map.get(point[0]).add(point[1]);
        }

        for (int[] pointA : points) {
            for (int[] pointB : points) {
                if (pointA[0] == pointB[0] || pointA[1] == pointB[1]) {
                    continue;
                }
                if (!map.get(pointA[0]).contains(pointB[1])
                    || !map.get(pointB[0]).contains(pointA[1])) {
                        continue;
                }
                res = Math.min(res, Math.abs((pointB[0] - pointA[0]) * (pointB[1] - pointA[1])));
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}