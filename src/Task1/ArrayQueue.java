package Task1;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    // Инвариант: queue != null, 0 <= size <= queue.length,
    // 0 <= front < queue.length, 0 <= rear < queue.length

    // Предусловие: capacity > 0
    public ArrayQueue(int capacity) {
        this.queue = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает true, если очередь пуста, иначе false
    public boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает текущий размер очереди
    public int size() {
        return size;
    }

    // Предусловие: queue != null, 0 <= size < queue.length
    // Постусловие: добавляет элемент в конец очереди
    public void enqueue(int item) {
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;
    }

    // Предусловие: queue != null, size > 0
    // Постусловие: возвращает первый элемент в очереди и удаляет его из очереди
    public int dequeue() {
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    // Предусловие: queue != null, size > 0
    // Постусловие: возвращает первый элемент в очереди
    public int element() {
        return queue[front];
    }

    // Предусловие: queue != null
    // Постусловие: очищает очередь
    public void clear() {
        Arrays.fill(queue, 0);
        size = 0;
        front = 0;
        rear = 0;
    }
}
