public class Queue {
    private Node first;
    private Node last;
    private int size;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Queue() {
        this.size = 0;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (size == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        first = first.next;
        size--;
    }

    public void display() {
        Node temp = first;
        System.out.println("First: " + first.value);
        System.out.println("Size: " + size);
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);

        q.display();
        q.dequeue();
        q.display();
    }
}
