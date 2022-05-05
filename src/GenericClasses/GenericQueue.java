package GenericClasses;

public class GenericQueue<T> {
    private static final int CAPACIDAD_INICIAL = 5;

    private GenericCollection<T> collection = new GenericCollection<T>(CAPACIDAD_INICIAL);

    public void enqueue(T element) {
        collection.insert(element, collection.getNumObject());
    }

    public T dequeue() {return collection.delete(0);}

}
