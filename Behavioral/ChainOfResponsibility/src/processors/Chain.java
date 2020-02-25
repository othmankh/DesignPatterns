package processors;

import models.Request;

public interface Chain {
    void setNext(Chain nextInChain);
    void process(Request request);
}
