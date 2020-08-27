class Solution {
    public int[] findRightInterval(int[][] intervals) {        
        int[] result = new int[intervals.length];
        Arrays.fill(result, -1);
        
        Node[] leftIndex = new Node[intervals.length];
        for(int i = 0 ; i<intervals.length ; i++) {
            Node n = new Node();
            n.index = i;
            n.value = intervals[i][0];
            leftIndex[i] = n;
        }
        Arrays.sort(leftIndex);
        
        for(int i = 0 ; i<intervals.length ; i++) {
            int rightIndex = intervals[i][1];
            int left = 0, right = intervals.length-1;
            while(left <=right) {
                int mid = (left + right) / 2;
                Node tmp = leftIndex[mid];
                if(tmp.value > rightIndex) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            if(leftIndex[right].value == rightIndex) {
                result[i] = leftIndex[right].index;
            }else if(right<intervals.length-1) {
                result[i] = leftIndex[right+1].index;
            }
            
        }
        return result;
    }
    
    public static class Node implements Comparable<Node>{
        int value;
        int index;
        @Override
        public int compareTo(Node o) {
            // TODO Auto-generated method stub
            return this.value - o.value;
        }
    }
}