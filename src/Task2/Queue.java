package Task2;

public interface Queue<E> {
    void enqueue(E element); // добавка элемента

    E element(); // первый элемент из очереди

    E dequeue(); // удаление первого элемента

    int size(); // размер очереди

    boolean isEmpty(); // проверка на пустоту

    void clear(); // очистка
}
