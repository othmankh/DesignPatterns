package Models;

import Interfaces.Radius;

public class RoundHole {

    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(Radius peg) {
        return this.getRadius() >= peg.getRadius();
    }

    public int getRadius() {
        return radius;
    }
}
