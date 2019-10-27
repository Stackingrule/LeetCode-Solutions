class MinStack {
private:
    stack<int> valueStack, minStack;

public:
    /** initialize your data structure here. */
    MinStack() {
        
    }
    
    void push(int x) {
        valueStack.push(x);
        if(minStack.empty() || minStack.top() >= x)
            minStack.push(x);
        
    }
    
    void pop() {
        if(valueStack.top() == minStack.top()) minStack.pop();
        valueStack.pop();
        
    }
    
    int top() {
        return valueStack.top();
        
    }
    
    int getMin() {
        return minStack.top();
        
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(x);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */