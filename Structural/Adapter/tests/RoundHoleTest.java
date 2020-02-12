import Adapters.SquarePegAdapter;
import Models.RoundHole;
import Models.RoundPeg;
import Models.SquarePeg;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoundHoleTest {

    static RoundHole roundHole;

    @BeforeAll
    public static void init() {
      roundHole = new RoundHole(10);
    }

    @AfterAll
    public static void destroy() {
        roundHole = null;
    }

    @Test
    public void fitsShouldReturnFalseForARoundPegWithABiggerRadiusThanHoleRadius() {
        RoundPeg roundPeg = new RoundPeg(15);
        assertFalse(roundHole.fits(roundPeg));
    }

    @Test
    public void fitsShouldReturnTrueARoundPegWithRadiusLessThanHoleRadius() {
        RoundPeg roundPeg = new RoundPeg(9);
        assertTrue(roundHole.fits(roundPeg));
    }

    @Test
    public void fitsShouldReturnFalseForASquarePigAdapterWithABiggerRadiusThanHoleRadius() {

        SquarePeg squarePeg = new SquarePeg(30);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        assertFalse(roundHole.fits(squarePegAdapter));
    }

    @Test
    public void fitsShouldReturnTrueSquarePigAdapterRadiusLessThanHoleRadius() {
        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        assertTrue(roundHole.fits(squarePegAdapter));
    }
}
