package cab_platform_lld.pojos.cab;

import cab_booking_design_problem.pojos.Location;
import cab_platform_lld.pojos.location.ILocation;
import cab_platform_lld.pojos.Person;

public class Cab  {


    // name, location, available

    CabStatus status;

    private String name;
    ILocation location;

    Cab(Builder builder) {
        this.name = builder.name;
        this.location = builder.location;
        this.status = CabStatus.IDLE;
    }

    public String getName() {
        return this.name;
    }

    public ILocation getLocation() {
        return this.location;
    }

    public Cab() {}

    public static class Builder {
        private String name;
        private ILocation location;

        private Builder() {}

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocation(ILocation location) {
            this.location = location;
            return this;
        }

        public Cab build() {
            return new Cab(this);
        }
    }

    public void updateLocation(ILocation newLocation) {
        // update location and
    }

    public void setActive() {

    }

    public void setDeactive() {

    }
}
