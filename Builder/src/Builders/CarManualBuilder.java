package Builders;

import Engines.Engine;
import Models.Manual;

public class CarManualBuilder implements Builder
{
    private Manual manual;
    private Engine engine;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTripComputer(boolean tripComputer) {

    }

    @Override
    public void setGPS(boolean gps) {

    }

    public Manual getProduct() {
        Manual manual =  this.manual;
        this.reset();
        return manual;
    }
}
