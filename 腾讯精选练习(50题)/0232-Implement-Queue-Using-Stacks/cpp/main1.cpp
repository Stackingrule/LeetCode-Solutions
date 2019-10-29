class MyQueue {
private:
    stack<int> inputStack;
    stack<int> outputStack;

public:
    /** Initialize your data structure here. */
    MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    void push(int x) {
        inputStack.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    int pop() {
        int val;
        if(!outputStack.empty()) {
            val= outputStack.top();
            return val;
        }
         
        
    }
    
    /** Get the front element. */
    int peek() {
        
    }
    
    /** Returns whether the queue is empty. */
    bool empty() {
        
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */