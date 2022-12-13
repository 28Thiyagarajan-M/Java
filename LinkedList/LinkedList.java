public class LinkedList {
    
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList(){
        this.size = 0;
    }
    
    
    private class Node{
        int val;
        Node next;
        
        public Node (int val){
            this.val = val;
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
        
        tail.next = node;
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
            return;
        }
        
        
        Node node= new Node(val);
        
        Node temp = head;
        
        for(int i = 1; i<index;i++){
            temp = temp.next;
        }
        
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
    
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        
        System.out.println("End");
        System.out.println("Size : "+ size);
    }
    
    public int deleteLast(){
        int val = tail.val;
        
        Node secondLast = get(size-2);
        secondLast.next = null;
        tail = secondLast;
        
        size--;
        
        return val;
    }
    
    public int delete(int index){
        
        if(index == size-1){
            
            return deleteLast();
        }
        if(index == 0){
            return deleteFirst();
        }
        
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        
        size --;
        return val;
        
    }
    
    public Node find(int val){
        
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        
        return null;
    }
    
    public Node get(int index){
        Node node = head;
        
        for(int i = 0; i<index;i++){
            node = node.next;
        }
        
        return node;
    }
    
    
    
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        
        ll.insertFirst(10);
        ll.insertFirst(20);
        
        ll.insertFirst(230);
         ll.insertLast(30);
         ll.insertLast(23);
         
        
        ll.display();
        ll.displayFirst();
        ll.display();
        ll.deleteLast();
        ll.display();
        ll.delete(2);
        
        
        ll.display();
        
       
         System.out.println(ll.find(30));   
       
    }
    
    
}
