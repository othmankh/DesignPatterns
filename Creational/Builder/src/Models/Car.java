package Models;

import Engines.Engine;

public class Car {

    private Engine engine;
    private int seats;
    private boolean tripComputer;
    private boolean gps;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
}
