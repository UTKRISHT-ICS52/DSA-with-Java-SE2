public class QueueUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front = null;
        Node rear = null;

        // Check if queue is empty
        boolean isEmpty() {
            return front == null && rear == null;
        }

        // Enqueue (Add)
        void add(int data) {
            Node newNode = new Node(data);

            // If queue is empty
            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // Dequeue (Remove)
        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = front.data;

            // Single element case
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
            }

            return result;
        }

        // Peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); // 10
        System.out.println(q.peek());   // 20

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
