class StackOfPlates {
public:
    vector<stack<int>> vec;
    int cnt;
    StackOfPlates(int cap) {
        cnt = cap;
    }
    
    void push(int val) {
        if (cnt == 0) return ;
        if (vec.empty()) {
            vec.push_back(stack<int>());
            if (!vec.empty() && vec.back().size() < cnt) vec.back().push(val);
        }else {
            if (vec.back().size() == cnt) {
                vec.push_back(stack<int>());
            }
            if (vec.back().size() < cnt) vec.back().push(val);
        }
    }
    
    int pop() {
        if (cnt == 0) return -1;
        if (!vec.empty()) {
            while (!vec.empty() && vec.back().empty()) {
                vec.pop_back();
            }
            if (!vec.empty()) {
                int ret = -1;
                if (!vec.back().empty()) {
                    ret = vec.back().top();
                    vec.back().pop();
                    if (vec.back().empty()) vec.pop_back();
                }
                return ret;
            }

        }
        return -1;
    }
    
    int popAt(int index) {
        if (cnt == 0) return -1;
        if (vec.size() <= index) return -1;
        int ret = vec[index].top();
        vec[index].pop();
        if (vec[index].empty()) {
            vec.erase(vec.begin() + index);
        }
        return ret;
    }
};

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates* obj = new StackOfPlates(cap);
 * obj->push(val);
 * int param_2 = obj->pop();
 * int param_3 = obj->popAt(index);
 */