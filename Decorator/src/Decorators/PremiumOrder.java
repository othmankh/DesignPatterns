package Decorators;

import Models.BaseOrder;
/* Add additional 10% discount on preoder for premium Users */
public class PremiumOrder extends OrderDecorator {

    private final double premiumDiscountRate = 0.9;

    public PremiumOrder(BaseOrder order) {
        super(order);
    }

    @Override
    public double getTotal() {
        System.out.println("Getting total for premimum");
        double total = super.getTotal();
        return premiumDiscountRate* total;
    }

}
