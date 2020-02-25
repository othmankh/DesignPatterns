import models.Request;
import processors.Chain;
import processors.NegativeProcessor;
import processors.PositiveProcessor;
import processors.ZeroProcessor;

public class Main {
    public static void main(String[] args) {

        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();
        c1.setNext(c2);
        c2.setNext(c3);

        //calling chain of responsibility
        c1.process(new Request(90));
        c1.process(new Request(-50));
        c1.process(new Request(91));
        c1.process(new Request(0));

    }
}
