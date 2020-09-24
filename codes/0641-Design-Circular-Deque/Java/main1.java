/**
1. 使用指针head 指向队列头的前一个位置, tail 指向队列尾的后一个位置, 这个思路类似链表的dummy 节点
2. 临界状态为插入第一个值时, 头尾指针都要让开
3. 保证head, tail都指向空, 多开一个空间
*/

class MyCircularDeque {
    int head, size, tail, count;
    int[] data;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.size = k+1;
        this.data = new int[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    private int prev(int index) {return (index - 1 + size) % size;}
    private int next(int index) {return (index + 1) % size;}

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) return false;
        data[head] = value;
        count ++ ;
        if (head == tail) tail = next(tail);
        head = prev(head);
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) return false;
        data[tail] = value;
        count ++ ;
        if (head == tail) head = prev(head);
        tail = next(tail);
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) return false;
        head = next(head);
        count --;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) return false;
        tail = prev(tail);
        count --;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return isEmpty() ? -1 : data[next(head)];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        return isEmpty() ? -1 : data[prev(tail)];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return count == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return count == size-1;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */