package Models;

public class Preorder extends BaseOrder {

    private final double discountRate = 0.9;
    @Override
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total * discountRate;
    }
}
