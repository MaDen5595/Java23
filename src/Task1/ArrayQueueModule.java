package Task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int[] queue;
    private static int size;
    private static int front;
    private static int rear;

    // Инвариант: queue != null, 0 <= size <= queue.length,
    // 0 <= front < queue.length, 0 <= rear < queue.length

    // Предусловие: capacity > 0
    public static void create(int capacity) {
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает true, если очередь пуста, иначе false
    public static boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает текущий размер очереди
    public static int size() {
        return size;
    }

    // Предусловие: queue != null, 0 <= size < queue.length
    // Постусловие: добавляет элемент в конец очереди
    public static void enqueue(int item) {
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;
    }

    // Предусловие: queue != null, size > 0
    // Постусловие: возвращает первый элемент в очереди и удаляет его из очереди
    public static int dequeue() {
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    // Предусловие: queue != null, size > 0
    // Постусловие: возвращает первый элемент в очереди
    public static int element() {
        return queue[front];
    }

    // Предусловие: queue != null
    // Постусловие: очищает очередь
    public static void clear() {
        Arrays.fill(queue, 0);
        size = 0;
        front = 0;
        rear = 0;
    }
}
