package cab_platform_lld.exceptions;

public class CabNotFoundException extends RuntimeException {

    public CabNotFoundException(String name) {
        super("Cab with name[" + name + "] is not registered" );
    }
}
