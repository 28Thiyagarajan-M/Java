public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;

        if (node == null)
            return;

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }

            node = node.next;
        } while (node != head);
    }

    public void display() {
        Node temp = head;

        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("End");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.next = next;
        }
    }

    public static void main(String[] p) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(23);
        cll.insert(54);
        cll.insert(63);
        cll.insert(98);

        cll.display();

        cll.delete(98);
        cll.display();
    }
}
