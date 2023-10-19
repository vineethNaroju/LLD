package cab_booking_design_problem.services;

import cab_booking_design_problem.IJourney;

import java.util.HashMap;

public class JourneyManager {

    private final HashMap<String, IJourney> storage;

    public JourneyManager() {
        storage = new HashMap<>();
    }




}
