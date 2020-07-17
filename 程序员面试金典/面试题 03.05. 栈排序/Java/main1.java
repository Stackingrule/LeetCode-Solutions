class SortedStack {

    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> help = new Stack<>();

    public SortedStack() {

    }
    
    public void push(int val) {
        while (!data.isEmpty() && data.peek() < val) {
            help.add(data.pop());
        }

        data.add(val);
        while (!help.isEmpty()) {
            data.add(help.pop());
        }
    }
    
    public void pop() {
        if (!data.isEmpty()) {
            data.pop();
        }
    }
    
    public int peek() {
        if (!data.isEmpty()) {
            return data.peek();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return data.isEmpty();
    }
}

/**
 * Your SortedStack object will be instantiated and called as such:
 * SortedStack obj = new SortedStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.isEmpty();
 */