
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
    
    
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;  
        }
        
        System.out.println("End");
    }
    
    
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        
        ll.insertFirst(23);
        ll.insertFirst(5);
        
        ll.insertFirst(34);
        ll.insertFirst(21);
        
        ll.display();
    }
    
}
