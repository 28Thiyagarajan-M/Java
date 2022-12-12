
public class LinkedList{
    
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList(){
        this.size = 0;
    }
    
    private class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val = val;
        }
        
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        
        node.next = head;
        head = node;
        
        if(tail == null){
            tail = head;
        }
        size++;
    }
    
    public void insertLast(int val){
        Node node = new Node(val);
        
        if(tail == null){
            insertFirst(val);
            return;
        }
        
        tail.next  = node;
        tail = node;
        size++;
    }
    
    public void insert(int val, int index){
        
        if(index == 0){
            insertFirst(val);
            return;
        }
        
        if(index == size){
            insertLast(val);
        }
        
        Node temp = head;
        
        for(int i =1; i< index; i++){
            temp = temp.next;
        }
        
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        
        if(head == null){
            tail = null;
        }
        size--;
        
        return val;
                
    }
    
    public int deleteLast(){
        int val = tail.val;
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    
    public Node get(int index){
        Node node = head;
        for(int i = 0; i<index; i++){
            node = node.next;
        }
        
        return node;
    }
    
    
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;  
        }
        
        System.out.println("End");
        System.out.println("Size : "+ size);
    }
    
    
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        
        System.out.println("Insertion:");
        ll.insertFirst(23);
        ll.insertFirst(5);
        
        ll.insertFirst(34);
        ll.insertFirst(21);
        
        ll.insertLast(999);
        
        ll.insert(28,4);
        
        ll.display();
        
        System.out.println("Deletion:");
        
        System.out.println(ll.deleteFirst());
        
        ll.display();
        
         System.out.println(ll.deleteLast());
         ll.display();
    }
    
}
