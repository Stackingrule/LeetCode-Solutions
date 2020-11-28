class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList();
        while(left <= right){
            if(isValid(left)) res.add(left);
            left++;
        }
        return res;
    }
    
    public boolean isValid(int num){
        int n = num;
        while(num > 0){
            int temp = num % 10;
            if(temp == 0 || n % temp > 0) return false;
            num /= 10;
        }   
        return true;
    }
}