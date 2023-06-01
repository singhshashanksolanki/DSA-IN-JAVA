package queue;

public class CircularQueueArray {

    static class CircularQ {
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        CircularQ(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int removeEle = arr[front];
            if (rear == front) {
                rear = front = -1;

            } else {
                front = (front + 1) % size;
            }
            return removeEle;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        CircularQ q = new CircularQ(3);
        q.remove();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.remove();
        q.remove();
        q.add(5);
        q.add(56);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
