class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word:words){
            int num = map.getOrDefault(word, 0);
            map.put(word, num + 1);
        }
        PriorityQueue<Pair<String, Integer>> queue = new PriorityQueue<>((a, b) ->{
                return a.getValue().equals(b.getValue()) ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue();
            }
        );
        for(String word:map.keySet()){
            int time = map.get(word);
                queue.offer(new Pair<>(word, time));
            if(queue.size() > k)
                queue.poll();
        }
        List<String> res = new ArrayList<>();
        while(!queue.isEmpty())
            res.add(queue.poll().getKey());
        Collections.reverse(res);
        return res;
    }
}
