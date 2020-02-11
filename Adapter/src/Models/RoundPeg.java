package Models;

import Interfaces.Radius;

public class RoundPeg implements Radius {

    private double radius;

    public RoundPeg() {

    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
