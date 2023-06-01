package queue;

public class QueueArray {

    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public void add(int item) {
            if (rear == size - 1) {
                return;
            }

            rear++;
            arr[rear] = item;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String args[]) {
        queue q = new queue(5);
        q.add(5);
        q.add(6);
        q.add(1);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
