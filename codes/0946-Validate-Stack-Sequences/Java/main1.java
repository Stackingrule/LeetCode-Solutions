class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed == null || popped == null || pushed.length != popped.length){
            return false;
        }

        Stack<Integer> stk = new Stack<>();
        int ind = 0;
        for(int x : pushed){
            stk.push(x);
            while(!stk.isEmpty() && popped[ind] == stk.peek()){
                stk.pop();
                ind++;
            }
        }

        return stk.isEmpty();
    }
}