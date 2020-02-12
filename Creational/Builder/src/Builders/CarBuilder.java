package Builders;

import Engines.Engine;
import Models.Car;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean gps) {
        car.setGps(gps);
    }

    public Car getProduct() {
        Car car = this.car;
        this.reset();
        return car;
    }
}
