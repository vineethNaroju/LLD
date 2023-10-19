package cab_booking_design_problem;

import cab_booking_design_problem.pojos.Cab;
import cab_booking_design_problem.pojos.Rider;
import lombok.Getter;

import java.util.List;

public abstract class IJourney {

    @Getter
    private final Cab cab;

    @Getter
    private final List<Rider> riderList;

    public IJourney(Cab cab, List<Rider> riderList) {
        this.cab = cab;
        this.riderList = riderList;
    }

}
