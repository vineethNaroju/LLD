package cache_design_problem.exceptions;

public class UnknownKeyTypeException  extends RuntimeException {

    public UnknownKeyTypeException(Class<?> keyClass) {
        super("Cache key type : " + keyClass.getName() + " is unknown.");
    }
}
