class Node{
    int key ,value;
    Node prev , next;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}


class LRUCache {
    Map<Integer, Node> mpp;
    int capacity;
    Node head, tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        mpp = new HashMap<>();
         head = new Node(0,0);
          tail = new Node(0,0);
         head.next = tail;
         tail.prev = head;
    }
    
    public int get(int key) {
        if(mpp.containsKey(key)){
            Node node = mpp.get(key);
            remove(node);
            add(node);
            return node.value;
        } 
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            remove(mpp.get(key));
        }
        if(mpp.size() == capacity){
            remove(tail.prev);
        }
        add(new Node(key ,  value));
    }

    public void add(Node node){
        mpp.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public void remove(Node node)
    {
        mpp.remove(node.key);
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */