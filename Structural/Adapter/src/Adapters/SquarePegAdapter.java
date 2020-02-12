package Adapters;

import Interfaces.Radius;
import Models.SquarePeg;

public class SquarePegAdapter implements Radius {

    private SquarePeg squarePeg;


    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) /2;
    }

}
