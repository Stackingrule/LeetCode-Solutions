class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new ListNode(-1);
        tail = new ListNode(1);
        head.next = tail;
        tail.prev = head;

        this.size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0 || index>=this.size){
            return -1;
        }

        ListNode cur = this.head;
        while(index-->0){
            cur = cur.next;
        }

        return cur.next.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(this.size, val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>this.size){
            return;
        }

        ListNode cur = this.head;
        while(index-- > 0){
            cur = cur.next;
        }

        ListNode addedNode = new ListNode(val);
        addedNode.next = cur.next;
        addedNode.prev = cur;
        cur.next.prev = addedNode;
        cur.next = addedNode;

        this.size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index<0 || index>=this.size){
            return;
        }

        ListNode cur = this.head;
        while(index-- > 0){
            cur = cur.next;
        }

        ListNode deletedNode = cur.next;
        cur.next = deletedNode.next;
        deletedNode.next.prev = cur;

        this.size--;
    }
}

class ListNode{
    int val;
    ListNode prev;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */