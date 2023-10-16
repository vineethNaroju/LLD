package cache_design_problem.exceptions;

public class UnknownValueTypeException extends RuntimeException {
    public UnknownValueTypeException(Class<?> valueClass) {
        super("Cache value type : " + valueClass.getName() + " is unknown.");
    }
}
