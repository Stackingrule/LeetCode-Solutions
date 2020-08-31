class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len = rooms.size();
        int[] visited = new int[len];//初始化等长数组，数组每个值默认为0
        helper(rooms, 0, visited);
        for (int i : visited)
            if (i == 0) return false;//数组中依然有0，则证明有房间未访问到
        return true;
    }

    private void helper(List<List<Integer>> rooms, int index, int[] visited) {
        if (visited[index] == 1) return;//如果该房间已访问过，直接返回
        visited[index] = 1;//在访问过的房间，改为1来标记
        for (Integer i : rooms.get(index)) {//遍历
            helper(rooms, i, visited);
        }
    }
}
