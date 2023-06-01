package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class QueueCollectionFramework {
    // Implementing Queue using LinkedList in collection Framework
    // public static void main(String args[]) {
    // Queue<Integer> q = new LinkedList<>();

    // q.add(1);
    // q.add(2);
    // q.add(3);
    // while (!q.isEmpty()) {
    // System.out.println(q.peek());
    // q.remove();
    // }
    // }

    // Implementing Queue using ArrayDeque
    public static void main(String args[]) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
