class SinglyLinkedList{
    
    private Node head;
    private Node tail;
    private int size;
    
    class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value = value;
        }
    }
    
    public void insertAtBegining(int value){
        Node node = new Node(value);
        if(size  == 0){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }
    
    public void insertAtEnd(int value){
        Node node = new Node(value);
        if(size == 0){
            tail = node;
            head = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    
    public void insertAtPosition(int value, int index){
        
         if(index == 0 || index >= size ){
            return;
        }else if(index == 0){
            insertAtBegining(value);
            return;
        }else if(index == size){
            insertAtEnd(value);
            return;
        }else{
            Node node = new Node(value);
            Node temp = head;
            int currentIndex = 0;
            while(currentIndex != index-1){
                temp = temp.next;
                currentIndex++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }
    
    public void getNode(int index){
        if(index < 0 || index >= size ){
            return;
        }
        Node temp = head;
        int currentIndex = 0;
        while(currentIndex != index){
            temp = temp.next;
            currentIndex++;
        }
        System.out.println(temp.value);
    }
    
    public void removeAtBegining(){
        if(size == 0){
            return;
        }else{
           head = head.next; 
        }
        size--;
    }
    
    public void removeAtEnd(){
        if(size == 0){
            return;
        }else{
           Node temp = head;
           while(temp.next.next != null){
               temp = temp.next;
           }
           temp.next = null;
           tail = temp;
        }
        size--;
    }
    
    public void removeAtPosition(int index){
        
         if(index < 0 || index >= size ){
            return;
        }else if(index == 0){
            removeAtBegining();
            return;
        }else if(index == size){
           removeAtEnd();
            return;
        }else{
        Node temp = head;
        int currentIndex = 0;
        while(currentIndex != index-1){
            temp = temp.next;
            currentIndex++;
        }
        
        temp.next = temp.next.next;
        size--;
    
        }
    }
    
    public void updateAtBegining(int value){
        if(size == 0) return;
        head.value = value;
    }
    
    
    public void updateAtEnd(int value){
        if(size == 0) return;
        tail.value = value;
    }
    
    
    public void updateAtPosition(int value, int index){
        if(index < 0 || index >= size)
        {
            return;
        }else if (index == 0) {
            updateAtBegining(value);
            return;
        }else if (index == size-1){
            updateAtEnd(value);
            return;
        }else{
            Node temp = head;
            int currentIndex = 0;
            while(currentIndex != index){
                temp = temp.next;
                currentIndex++;
            }
            
            temp.value = value;
            
        }
        
    }
    
    
    public void display(){
        System.out.println("Head : "+head.value);
        System.out.println("Tail : "+tail.value);
        System.out.println("Size : "+size);
        
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
    }

   public static void main(String args[]) {
    SinglyLinkedList  sll = new SinglyLinkedList();
    sll.insertAtBegining(1);
    sll.insertAtEnd(2);
    sll.insertAtEnd(3);
    sll.insertAtEnd(4);
    sll.insertAtEnd(5);
    sll.insertAtPosition(0,1);
    // sll.getNode(3);
    sll.removeAtPosition(0);
    sll.display();
    sll.updateAtPosition(2,2);
    sll.display();
    }
    
}
