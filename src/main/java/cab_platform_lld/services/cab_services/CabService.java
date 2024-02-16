package cab_platform_lld.services.cab_services;


import cab_platform_lld.exceptions.CabNotFoundException;
import cab_platform_lld.exceptions.DuplicateCabException;
import cab_platform_lld.pojos.cab.Cab;
import cab_platform_lld.pojos.location.ILocation;

import java.util.HashMap;
import java.util.Map;

public class CabService {

    Map<String, Cab> cabMap = new HashMap<>();

    final ICabAvailabilityService availabilityService;

    public CabService() {
        this.availabilityService = new DefaultCabAvailabilityService();
    }

    public Cab registerCab(String name, ILocation location) {
        if(cabMap.containsKey(name)) {
            throw new DuplicateCabException(name);
        }

        Cab cab = Cab.Builder.newInstance()
                .setName(name)
                .setLocation(location)
                .build();

        cabMap.put(name, cab);
        availabilityService.markCabAsIDLE(cab);

        return cab;
    }

    public void updateCabLocation(Cab cab, ILocation newLocation) {
        if(!cabMap.containsKey(cab.getName())) {
            throw new CabNotFoundException(cab.getName());
        }


        cab.updateLocation(newLocation);


    }

}
