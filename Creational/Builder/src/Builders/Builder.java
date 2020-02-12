package Builders;

import Engines.Engine;

public interface Builder {
    void reset();

    void setSeats(int number);

    void setEngine(Engine engine);

    void setTripComputer(boolean tripComputer);

    void setGPS(boolean gps);

}
