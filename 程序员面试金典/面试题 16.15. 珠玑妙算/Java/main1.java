class Solution {
    public int[] masterMind(String solution, String guess) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c : solution.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int fake = 0, real = 0;
        for(char c : guess.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                fake++;
                map.put(c, map.get(c) - 1);
            }   
        }

        for(int i = 0; i < 4; i++){
            if(solution.charAt(i) == guess.charAt(i))
                real++;
        }

        int[] ans = {real, fake - real};

        return ans;
    }
}
