import Adapters.SquarePegAdapter;
import Models.RoundHole;
import Models.RoundPeg;
import Models.SquarePeg;

public class Main {

    public static void main (String [] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        boolean fits = roundHole.fits((roundPeg));

        System.out.println("Fits result is: " + fits);

        SquarePeg squarePeg = new SquarePeg(10);
        SquarePeg smallSquarePeg = new SquarePeg(5);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);

        System.out.println("Square Fits result is: " + roundHole.fits(squarePegAdapter));

        System.out.println("Small Square Fits result is: " + roundHole.fits(smallSquarePegAdapter));

    }
}
