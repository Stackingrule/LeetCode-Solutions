class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] room = new boolean[rooms.size()];
        dfs(rooms, room, 0);
        for(boolean r: room) {
            if(!r)
                return false;
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, boolean[] room, int i) {
        room[i] = true;
        List<Integer> list = rooms.get(i);
        for(int j: list) {
            if(! room[j]) {
                dfs(rooms, room, j);
            }
        }        
    }
}