public class CircularQueue {
    static class Queue {
        int arr[];
        int size;
        int front = -1;
        int rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // Check if queue is empty
        boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // Check if queue is full
        boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue (Add)
        void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // First element insertion
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue (Remove)
        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // Single element case
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q.remove()); // 10
        q.add(50);

        System.out.println(q.peek());   // 20

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

