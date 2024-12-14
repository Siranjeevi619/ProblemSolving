class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        this.queue = new LinkedList<>();
    }
    
    public void push(int x) {
        if(queue.size() == 0){
            queue.add(x);
        }else{
            queue.add(x);
            for(int i=0;i<queue.size() -1 ; i++){
                int temp = queue.remove();
                queue.add(temp);
            }
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */