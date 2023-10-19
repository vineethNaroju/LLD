package cab_booking_design_problem.exceptions;

public class CabNotFoundException extends RuntimeException {

    public CabNotFoundException(String cabId) {
        super("Cab[" + cabId + "] is not found");
    }
}
