/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(x);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
class MinStack {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        s1.push(x);
        if (s2.isEmpty() || x <= s2.peek()) {
            s2.push(x);
        }
    }
    
    public void pop() {
        int x = s1.pop();
        if (s2.peek() == x) {
            s2.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();        
    }
}
