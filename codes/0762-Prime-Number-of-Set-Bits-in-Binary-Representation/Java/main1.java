class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for(int i=L;i<=R;i++){
            if(isPrime(Integer.bitCount(i))){
                count++;
            }
        }
        return count;
    }
    
    public boolean isPrime(int x){
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }
}