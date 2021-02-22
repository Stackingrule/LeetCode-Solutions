class Solution {
    public int[] minOperations(String boxes) {
        
        int len = boxes.length();
        int moves[] = new int[len];
        int total_right = 0;
        int total_left=0;
        
        for(int current_box=len-1;current_box>=0;current_box--)
        {
            if(boxes.charAt(current_box)=='1')
            {
                moves[0] +=  current_box;
                total_right++;
            }
        }
        
        if(boxes.charAt(0)=='1')
        {
             total_left++;
             total_right--;
        }
        
        for(int current_box=1;current_box<len;current_box++)
        {
            moves[current_box] = moves[current_box-1]+ total_left - total_right;
            if(boxes.charAt(current_box)=='1')
            {
                total_left++;
                total_right--;
            }
        }
        
        return moves;
    }
}