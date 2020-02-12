package Models;

public class RegularOrder extends BaseOrder {
    @Override
    public double getTotal() {
        double total = 0;
        for(Product product: products) {
            total += product.getPrice();
        }
        return total;
    }
}
