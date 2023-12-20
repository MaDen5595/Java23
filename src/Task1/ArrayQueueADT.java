package Task1;

import java.util.Arrays;

public abstract class ArrayQueueADT {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    // Инвариант: queue != null, 0 <= size <= queue.length,
    // 0 <= front < queue.length, 0 <= rear < queue.length

    // Предусловие: capacity > 0
    public static void create(ArrayQueueADT queue, int capacity) {
        queue.queue = new int[capacity];
        queue.size = 0;
        queue.front = 0;
        queue.rear = 0;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает true, если очередь пуста, иначе false
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает текущий размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Предусловие: queue != null, 0 <= size < queue.length
    // Постусловие: добавляет элемент в конец очереди
    public static void enqueue(ArrayQueueADT queue, int item) {
        queue.queue[queue.rear] = item;
        queue.rear = (queue.rear + 1) % queue.queue.length;
        queue.size++;
    }

    // Предусловие: queue != null, size > 0
    // Постусловие: возвращает первый элемент в очереди и удаляет его из очереди
    public static int dequeue(ArrayQueueADT queue) {
        int item = queue.queue[queue.front];
        queue.front = (queue.front + 1) % queue.queue.length;
        queue.size--;
        return item;
    }

    // Предусловие: queue != null, size > 0
    // Постусловие: возвращает первый элемент в очереди
    public static int element(ArrayQueueADT queue) {
        return queue.queue[queue.front];
    }

    // Предусловие: queue != null
    // Постусловие: очищает очередь
    public static void clear(ArrayQueueADT queue) {
        Arrays.fill(queue.queue, 0);
        queue.size = 0;
        queue.front = 0;
        queue.rear = 0;
    }
}
