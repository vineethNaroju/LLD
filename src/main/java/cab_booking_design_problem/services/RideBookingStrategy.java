package cab_booking_design_problem.services;

import cab_booking_design_problem.pojos.Cab;
import cab_booking_design_problem.pojos.Location;
import cab_booking_design_problem.pojos.Rider;

public abstract class RideBookingStrategy {

    protected final CabManager cabManager;

    public RideBookingStrategy(CabManager cabManager) {
        this.cabManager = cabManager;
    }


    public abstract Cab book(Rider rider, Location from, int searchRadius);
}
