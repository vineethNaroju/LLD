package cache_design_problem.exceptions;

public class StorageFullException extends RuntimeException {

    public StorageFullException() {
        super("Storage is full");
    }
}
