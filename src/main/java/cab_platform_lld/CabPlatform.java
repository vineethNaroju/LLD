package cab_platform_lld;

import cab_platform_lld.pojos.cab.Cab;
import cab_platform_lld.pojos.location.ILocation;
import cab_platform_lld.services.cab_services.CabService;
import cab_platform_lld.services.cab_services.DefaultCabAvailabilityService;
import cab_platform_lld.services.cab_services.ICabAvailabilityService;
import cab_platform_lld.services.rider_services.RiderService;

public class CabPlatform {

    final RiderService riderService;
    final CabService cabService;




    public CabPlatform() {
        this.riderService = new RiderService();
        this.cabService = new CabService();
    }

    public Cab registerCab(String driverName, ILocation location) {
        Cab cab = cabService.registerCab(driverName, location);
        return cab;
    }

    public void updateCabLocation(Cab cab, ILocation location) {
        cabService.
    }

    public void activateCab(Cab cab, ILocation location) {

    }

    public void deactivateCab(Cab cab, ILocation location) {

    }



}
