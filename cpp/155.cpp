class MinStack {
public:
    /** initialize your data structure here. */
    stack<int> stackValue;
    stack<int> stackMin;
    MinStack() {
        while(!stackValue.empty())
            stackMin.pop();

        while(!stackMin.empty())
            stackMin.pop();
    }

    void push(int x) {
        stackValue.push(x);
        if(stackMin.empty()) {
            stackMin.push(x);
        }
        else stackMin.push(min(stackMin.top(), x));
    }

    void pop() {
        int value = stackValue.top();
        stackValue.pop();
        if(value == stackMin.top())
            stackMin.pop();
    }

    int top() {
        return stackValue.top();
    }

    int getMin() {
        return stackMin.top();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


