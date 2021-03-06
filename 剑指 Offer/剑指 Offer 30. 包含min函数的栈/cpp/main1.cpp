class MinStack {

private:
    stack<int> data;
    stack<int> minValue;

public:
    /** initialize your data structure here. */
    MinStack() {

    }
    
    void push(int x) {
        data.push(x);
        if (minValue.empty() || x <= minValue.top()) {
            minValue.push(x);
        }
    }
    
    void pop() {
        if (minValue.top() == data.top()) {
            minValue.pop();
        }
        data.pop();
    }
    
    int top() {
        return data.top();
    }
    
    int min() {
        return minValue.top();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(x);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->min();
 */