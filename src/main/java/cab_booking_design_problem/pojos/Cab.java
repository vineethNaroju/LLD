package cab_booking_design_problem.pojos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Cab {

    private final String name;

    @Setter @Getter
    private Location location;

    @Getter @Setter
    private Boolean isAvailable;

    public Cab(String name, Location location) {
        this.name = name;
        this.location = location;
    }


}
