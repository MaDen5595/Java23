package Task1;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule.create(5);
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);

        System.out.println("Size: " + ArrayQueueModule.size());
        System.out.println("Element: " + ArrayQueueModule.element());

        while (!ArrayQueueModule.isEmpty()) {
            System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
        }
    }
}
