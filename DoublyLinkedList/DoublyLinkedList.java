public class DoublyLinkedList {
    private Node head;
    
 
    private class Node{
        
        int val;
        Node next;
        Node prev;
        
        public Node(){
            
        }

        public Node(int val){
            this.val = val;
        }
        
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        
        node.next = head;
        node.prev = null;
        
        if(head != null){
            head.prev = node;
        }
        
        head = node;
    }
    
    public void insertLast(int val){
        
         Node node = new Node(val);
         
        if(head == null){
            head = node;
            return;
        }
        
       
        
        Node temp = head;
   
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = node;
        node.prev = temp;
        node.next = null;
        
    }
    
    public void insert(int val,int index){
        
        if(index == 0){
            insertFirst(val);
            return;
        }
        
        Node temp = head;
        for(int i =1 ; i< index; i++){
            temp = temp.next;
        }
        
        Node node = new Node(val,temp.next,temp);
        temp.next.prev = node;
        temp.next = node;
        
        
        // node.next = temp.next;
        // node.prev = temp;
        // temp.next = node;
        
    }
    public void insertAfter(int aft, int val){
        
        Node p = find(aft);
        
        if(p == null) System.out.println("Doesn't Exists!!");
        
        Node node = new Node(val);
        
        
        node.prev = p;
        node.next = p.next;
        
        p.next.prev = node;
        p.next = node;
    }
    
    
    public Node find(int aft){
        Node node = head;
        
        while(node != null){
            if(node.val == aft) return node;
            node = node.next;
        }
        
        return null;
    }
    
    
    public void display(){
        
        Node node = head;
        Node last = null;
        
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        
        System.out.println("End");
        
        while(last != null){
            System.out.print(last.val + " - > ");
            last = last.prev;
        }
        System.out.println("Start");        
    }
    
    
    
    public static void main(String [] arhs){
        
        DoublyLinkedList dll = new DoublyLinkedList();
        
        dll.insertFirst(10);
         dll.insertFirst(5);
          dll.insertFirst(30);
          
           dll.insertFirst(20);
            dll.insertFirst(100);
            
             
            dll.insertLast(999);
            
            dll.display();
            
            dll.insert(2810,2);
            
            dll.display();
            
            dll.insertAfter(30,31);
            dll.display();
            
        
       
        
    }
    
}
