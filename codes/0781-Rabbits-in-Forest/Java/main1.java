class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
 
        for(int answer : answers)
        {
            if(answer == 0)
                result++;
            else
                map.put(answer, map.getOrDefault(answer, 0) + 1);
        }
 
        int groupCount = 0;
        int leftover = 0;
 
        for(int key : map.keySet())
        {
            int value = map.get(key);
            int groupSize = key + 1;
 
            groupCount = value / groupSize;
            leftover = value % groupSize;
 
            if(leftover > 0)
                groupCount++;
 
            result += groupCount * groupSize;
        }
 
        return result;
    }

}