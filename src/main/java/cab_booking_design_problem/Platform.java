package cab_booking_design_problem;

import cab_booking_design_problem.pojos.Location;
import cab_booking_design_problem.services.JourneyManager;
import cab_booking_design_problem.services.RideBookingStrategy;
import cab_booking_design_problem.services.RiderManager;

import java.util.List;

public class Platform {

    private final JourneyManager journeyManager;
    private final RiderManager riderManager;

    private final RideBookingStrategy rideBookingStrategy;



    public Platform(RideBookingStrategy rideBookingStrategy) {
        journeyManager = new JourneyManager();
        riderManager = new RiderManager();
        this.rideBookingStrategy = rideBookingStrategy;
    }

    public String registerRider(String name) {
        return riderManager.register(name);
    }

    public List<IJourney> getRiderHistory(String riderId) {
        return riderManager.getHistory(riderId);
    }

    public String registerCab(String name, Location location) {
        return "";
    }

    // throws RuntimeException
    public void updateCabLocation(String cabId, Location location) {

    }

    public IJourney book(String riderId, Location destination) {
       return null;
    }

}
