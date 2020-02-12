import Builders.Builder;
import Engines.NormalEngine;
import Engines.SportsEngine;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportsEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructNormalCar(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new NormalEngine());
        builder.setTripComputer(true);
        builder.setGPS(false);
    }
}
