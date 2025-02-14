package cab_platform_lld.services.cab_services;

import cab_platform_lld.pojos.cab.Cab;

public interface ICabAvailabilityService {

    public void markCabAsIDLE(Cab cab);

    public void markCabAsENGAGED(Cab cab);

    public void markCabAsINACTIVE(Cab cab);

}
