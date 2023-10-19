package cab_booking_design_problem.services;

import cab_booking_design_problem.pojos.Location;

public interface DistanceStrategy {

    public double getDistanceBetween(Location from, Location to);
}
