class MinStack {
private:
    stack<int> normalStack;
    stack<int> minStack;
    
public:
    /** initialize your data structure here. */
    MinStack() {
        
    }
    
    void push(int x) {
        normalStack.push(x);

        if(minStack.empty()) 
            minStack.push(x);
        else
            minStack.push(min(minStack.top(), x));
        
    }
    
    void pop() {
        assert(normalStack.size() > 0);
        int value = normalStack.top();
        normalStack.pop();
        if(value == this.getMin()) {
            this.minStack.pop();
        }
        return value;
    }
    
    int top() {
        return normalStack.top();
        
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