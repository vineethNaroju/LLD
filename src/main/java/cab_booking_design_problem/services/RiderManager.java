package cab_booking_design_problem.services;

import cab_booking_design_problem.IJourney;
import cab_booking_design_problem.pojos.Rider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RiderManager {

    HashMap<String, Rider> storage;

    public String register(String name) {
        return "";
    }

    public List<IJourney> getHistory(String riderId) {
        return new ArrayList<>();
    }
}
