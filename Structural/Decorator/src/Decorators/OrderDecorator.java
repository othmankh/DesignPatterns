package Decorators;

import Models.BaseOrder;

public class OrderDecorator extends BaseOrder {

    private BaseOrder order;

    public OrderDecorator(BaseOrder order) {
        this.order = order;
    }
    
    @Override
    public double getTotal() {
        return this.order.getTotal();
    }

}
