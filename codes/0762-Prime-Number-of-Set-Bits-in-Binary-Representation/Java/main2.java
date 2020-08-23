class Solution {
    public int countPrimeSetBits(int L, int R) {
        Set<Integer> prime_set = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        int ans = 0;
        
        for(int n = L; n <= R; n++){
            if(prime_set.contains(Integer.bitCount(n))){
                ans ++;
            }
        }
        return ans;
    }
}