package Models;

public class Preorder extends BaseOrder {

    private final double discountRate = 0.9;

    @Override
    public double getTotal() {
        return products.stream().mapToDouble(p -> p.getPrice()).sum() * discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
