class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, List<Integer>> map = new TreeMap();
        int rank = 1;
        
        for(int i = 0; i < arr.length; i++){
            map.putIfAbsent(arr[i], new ArrayList());
            map.get(arr[i]).add(i);
        }
        for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
            List<Integer> cur = entry.getValue();
            for(int i: cur) arr[i] = rank;
            rank++;
        }
        return arr;
    }
}