package cab_booking_design_problem.pojos;


import lombok.Getter;

public class Location {

    @Getter
    private final int X, Y;

    public Location(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public String toString() {
        return "Location[X:" + X + ",Y:" + Y + "]";
    }

}
