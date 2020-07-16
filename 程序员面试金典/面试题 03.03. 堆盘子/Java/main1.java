
class StackOfPlates {
    ArrayList<Stack<Integer>> stacks = new ArrayList<>();
    int cap;
    int now;
    /*通过now来维护这一些Stacks*/
    public StackOfPlates(int cap) {
        this.cap = cap;
        now = -1;
    }

    public void push(int val) {
        if (cap <= 0) {
            return;
        } else {
            if (now == -1 || stacks.get(now).size() == cap) { //为空或者已满
                stacks.add(new Stack<>());
                now++;
                stacks.get(now).add(val);
            } else {
                stacks.get(now).add(val);
            }
        }
    }

    public int pop() {
        if (stacks.size() == 0) {
            return -1;
        } else {
            if (stacks.get(now).size() == 1) {//需要销毁
                int num = stacks.get(now).pop();
                stacks.remove(now);
                now--;
                return num;
            } else {
                return stacks.get(now).pop();
            }
        }

    }

    public int popAt(int index) {
        if (index < 0 || index > now) {
            return -1;
        }
        if (stacks.get(index).size() == 1) {//需要销毁
            int ans = stacks.get(index).pop();
            stacks.remove(index);
            now--;
            return ans;
        } else {
            return stacks.get(index).pop();
        }
    }
}

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates obj = new StackOfPlates(cap);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAt(index);
 */