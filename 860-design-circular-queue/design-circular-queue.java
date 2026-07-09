class MyCircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;
    public MyCircularQueue(int k) {
        arr = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) { //add rear of the queue
       if(isFull()){
        return false;
       }
       rear =(rear + 1)% capacity;
       arr[rear] = value;
       size++;
       return true;

    }
    
    public boolean deQueue() {  //removing the element from front
        if(isEmpty()){
            return false;
        }
        front = (front+1) % capacity;
        size--;
        return true;
    }
    
    public int Front() {
        return size != 0 ? arr[front] : -1;
    }
    
    public int Rear() {
        return size > 0 ? arr[rear] : -1;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
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