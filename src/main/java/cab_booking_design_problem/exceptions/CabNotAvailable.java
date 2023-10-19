package cab_booking_design_problem.exceptions;

import cab_booking_design_problem.pojos.Location;

public class CabNotAvailable extends RuntimeException {

    public CabNotAvailable(Location location, int searchRadius) {
        super("Cabs not available within " + searchRadius + " search radius of " + location);
    }
}
