class MinStack {

    Stack<Integer> data;
    Stack<Integer> minValue;

    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        minValue = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
        if (minValue.empty() || x <= minValue.peek()) {
            minValue.push(x);
        }
        else {
            minValue.push(minValue.peek());
        }
    }
    
    public void pop() {
        if(!data.empty()) {//同时弹
            data.pop();
            minValue.pop();
        }
    } 
    
    public int top() {
        return data.peek();
    }
    
    public int min() {
        return minValue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */