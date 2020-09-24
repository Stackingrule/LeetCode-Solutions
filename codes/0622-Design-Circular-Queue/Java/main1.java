
class MyCircularQueue {
    
    private int[] buffer;
    private int front = 0;
    private int rear = -1;
    private int size = 0;
 
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.buffer = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (this.isFull()) {
            return false;    
        }
        
        this.rear = (this.rear + 1) % this.buffer.length;
        this.buffer[this.rear] = value;
        this.size++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (this.isEmpty()) {
            return false;
        }   
        
        this.front = (this.front + 1) % this.buffer.length;
        this.size--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return this.isEmpty() ? -1 : this.buffer[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return this.isEmpty() ? -1 : this.buffer[rear];    
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return this.size == 0;    
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return this.buffer.length == this.size;    
    }
}
 
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */