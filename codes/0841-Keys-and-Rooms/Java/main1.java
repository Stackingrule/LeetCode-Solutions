class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> set = new HashSet();
        Queue<Integer> queue = new LinkedList<>();
        for(Integer x:rooms.get(0)){
            queue.offer(x);
        }
        while(!queue.isEmpty()){
            int room = queue.poll();
            if(set.contains(room)){
                continue;
            }else{
                set.add(room);
                List<Integer> list = rooms.get(room);
                if(list!=null && list.size()>0){
                    for(Integer x: list){
                        queue.offer(x);
                    }
                }
            }
        }
        for(int i=1;i<rooms.size();i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}