class Solution {
    public int[] sortArrayByParity(int[] A) {
        int count = 0;
        int[] res = new int[A.length];
        
        for(int a : A) if(a % 2 == 0) res[count++] = a;
        for(int a : A) if(a % 2 == 1) res[count++] = a;
        
        return res;        
    }
}