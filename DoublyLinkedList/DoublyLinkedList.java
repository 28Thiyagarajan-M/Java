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
           dll.display();
           dll.insertFirst(20);
            dll.insertFirst(100);
            
        
       
        
    }
    
}
