class TripleInOne {

    int[] a;
    int[] tt = new int[3];
    int size;
    public TripleInOne(int statckSize){
        a = new int[3 * statckSize + 10];
        size = statckSize;
        for(int i = 0; i < 3; i++){
            tt[i] = i * statckSize - 1;
        }
    }

    public boolean isFull(int stackNum){
        return tt[stackNum] >= size * (stackNum + 1) - 1;

    }

    public void push(int stackNum, int value){
        if(isFull(stackNum))    return;
        a[++tt[stackNum]] = value;
    }

    public int pop(int stackNum){
        if(isEmpty(stackNum)) return -1;
        tt[stackNum]--;
        return a[tt[stackNum] + 1];
    }

    public int peek(int stackNum){
        if(isEmpty(stackNum))   return -1;
        return a[tt[stackNum]];
    }

    public boolean isEmpty(int stackNum){
        return tt[stackNum] < stackNum * size;
    }
}
/**
 * Your TripleInOne object will be instantiated and called as such:
 * TripleInOne obj = new TripleInOne(stackSize);
 * obj.push(stackNum,value);
 * int param_2 = obj.pop(stackNum);
 * int param_3 = obj.peek(stackNum);
 * boolean param_4 = obj.isEmpty(stackNum);
 */