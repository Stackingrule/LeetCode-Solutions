class CQueue {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

    public CQueue() {

    }
    
    public void appendTail(int value) {
    	stack1.push(value);
    }
    
    public int deleteHead() {
    	int res = -1;
    	if (stack1.empty() && stack2.empty()) {
    		return res;
    	}
    	if (stack2.empty()) {
    		while (!stack1.empty()) {
    			stack2.push(stack1.pop());
    		}
    	}

    	res = stack2.pop();
    	return res;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */