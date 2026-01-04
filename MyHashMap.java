import java.util.*;

public class MyHashMap<K, V> {

    // Node class
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private int capacity;
    private Node<K, V>[] buckets;

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        this.buckets = (Node<K, V>[]) new Node[capacity];
        this.size = 0;
    }

    // Hash function (handles null key)
    private int getIndex(K key) {
        if (key == null) return 0;
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    // PUT
    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        if ((double) size / capacity >= LOAD_FACTOR) {
            resize();
        }
    }

    // GET
    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    // REMOVE
    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // RESIZE
    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        Node<K, V>[] newBuckets = (Node<K, V>[]) new Node[capacity];

        for (Node<K, V> head : buckets) {
            while (head != null) {
                Node<K, V> next = head.next;
                int newIndex = getIndex(head.key);

                head.next = newBuckets[newIndex];
                newBuckets[newIndex] = head;
                head = next;
            }
        }
        buckets = newBuckets;
    }

    public int size() {
        return size;
    }
}


