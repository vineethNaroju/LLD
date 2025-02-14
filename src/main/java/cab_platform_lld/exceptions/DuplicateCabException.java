package cab_platform_lld.exceptions;

public class DuplicateCabException extends RuntimeException {

    public DuplicateCabException(String name) {
        super("Duplicate cab found with name[" + name + "]");
    }
}
