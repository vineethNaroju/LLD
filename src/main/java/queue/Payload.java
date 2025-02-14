package queue;

public class Payload<T> {
    final T data;

    Payload(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
