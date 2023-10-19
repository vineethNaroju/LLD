package cab_booking_design_problem.services;

import cab_booking_design_problem.exceptions.CabNotFoundException;
import cab_booking_design_problem.pojos.Cab;
import cab_booking_design_problem.pojos.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CabManager {

    private final HashMap<String, Cab> storage;



    public CabManager() {
        storage = new HashMap<>();
    }

    public String registerCab(String name, Location location) {
        Cab cab = new Cab(name, location);
        String hCode = String.valueOf(cab.hashCode());

        storage.put(hCode, cab);

        return hCode;
    }

    // throws RuntimeException
    public void updateCabLocation(String cabId, Location location) {
        if(!storage.containsKey(cabId)) {
            throw new CabNotFoundException(cabId);
        }

        storage.get(cabId).setLocation(location);
    }

    public List<Cab> getAvailableCabList() {
        ArrayList<Cab> res = new ArrayList<>();

        for(Map.Entry<String, Cab> entry : storage.entrySet()) {
            if(entry.getValue().getIsAvailable()) {
                res.add(entry.getValue());
            }
        }

        return res;
    }
}
