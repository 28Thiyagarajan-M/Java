public class Stack {
    private Node top;
    private int size;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Stack() {
        this.size = 0;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (size == 0) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

        size++;
    }

    public void pop() {
        if (size == 0) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(top.value);
            top = top.next;
            size--;
        }
    }

    public void display() {
        Node temp = top;
        System.out.println("Top: " + top.value);
        System.out.println("Size: " + size);
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        // s.display();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        s.pop();
        s.display();
    }
}
