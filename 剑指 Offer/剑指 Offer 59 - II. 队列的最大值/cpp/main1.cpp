class MaxQueue
{
public:
    queue<int> queue;
    deque<int> help;
    MaxQueue()
    {
    }

    int max_value()
    {
        //单调队列队首就是最大值
        return help.size() ? help.front() : -1;
    }

    void push_back(int value)
    {
        queue.push(value);
        //维护单调队列的单调性 把小的都出队了 那么队列剩余的都是比当前元素大的 所以是单调递增的 队首就是最大值
        //“后浪”思想:如果之前入队的队尾比后入队的当前元素还要小，就让队尾出队
        while (help.size() && help.back() < value)
        {
            help.pop_back();
        }
        help.push_back(value);
    }

    int pop_front()
    {
        if (!queue.size())
            return -1;
        int topValue = queue.front();
        queue.pop();
        //当普通队列的队首元素 等于 单调队列队首 就让单调队列队首出队
        if (help.size() && help.front() == topValue)
            help.pop_front();
        return topValue;
    }
};

/*
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue* obj = new MaxQueue();
 * int param_1 = obj->max_value();
 * obj->push_back(value);
 * int param_3 = obj->pop_front();
 */