package cab_booking_design_problem.services;

import cab_booking_design_problem.pojos.Location;

public class SimpleEucledianDistance implements DistanceStrategy {
    public double getDistanceBetween(Location from, Location to) {
        return Math.sqrt(
                Math.pow(from.getX() - to.getX(), 2)
                        + Math.pow(from.getY() - to.getY(), 2));
    }
}
