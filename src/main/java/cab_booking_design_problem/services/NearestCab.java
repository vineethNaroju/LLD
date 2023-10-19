package cab_booking_design_problem.services;

import cab_booking_design_problem.exceptions.CabNotAvailable;
import cab_booking_design_problem.pojos.Cab;
import cab_booking_design_problem.pojos.Location;
import cab_booking_design_problem.pojos.Rider;

import java.util.List;

public class NearestCab extends RideBookingStrategy {

    private final DistanceStrategy distanceStrategy = new SimpleEucledianDistance();

    public NearestCab(CabManager cabManager) {
        super(cabManager);
    }

    @Override
    public Cab book(Rider rider, Location from, int searchRadius) {
        List<Cab> cabList = cabManager.getAvailableCabList();

        double minDistance = searchRadius;
        Cab target = null;

        for(Cab cab : cabList) {

            double distance = distanceStrategy.getDistanceBetween(from, cab.getLocation());

            if(distance <= searchRadius && distance < minDistance) {
                minDistance = distance;
                target = cab;
            }
        }

        if(target == null) {
            throw  new CabNotAvailable(from, searchRadius);
        }

        return target;
    }
}
