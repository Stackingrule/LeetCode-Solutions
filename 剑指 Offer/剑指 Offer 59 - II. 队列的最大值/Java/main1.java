import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {

    Queue<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<>(); // 队列：插入和删除
        deque = new LinkedList<>(); // 双端队列：获取最大值
    }

    public int max_value() {
        return deque.size() > 0 ? deque.peek() : -1;    // 双端队列的队首为que的最大值
    }

    public void push_back(int value) {
        queue.offer(value);
        while (deque.size() > 0 && deque.peekLast() < value) {
            deque.pollLast();
        }
        deque.offerLast(value);

    }

    public int pop_front() {
        int t = queue.size() > 0 ? queue.poll() : -1;   //获得队首元素
        if (deque.size() > 0 && deque.peek().equals(t)) {
            deque.poll();   //如果出队的元素是当前最大值，将deq的队首出队
        }
        return t;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such: MaxQueue obj =
 * new MaxQueue(); int param_1 = obj.max_value(); obj.push_back(value); int
 * param_3 = obj.pop_front();
 */