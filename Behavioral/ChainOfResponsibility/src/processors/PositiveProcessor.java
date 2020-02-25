package processors;

import models.Request;

public class PositiveProcessor implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain nextInChain) {
        this.next = nextInChain;
    }

    @Override
    public void process(Request request) {
        if (request.getNumber() > 0) {
            System.out.println("Request with the number: " + request.getNumber()
                    + " has been processed by positive processor");
        } else {
            next.process(request);
        }
    }
}
