package queue;

public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Checking if the queue is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Enqueue
        public void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Dequeu
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int result = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return result;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.remove();
        q.add(1);
        q.add(2);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
