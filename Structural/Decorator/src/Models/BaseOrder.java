package Models;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseOrder {

    protected List<Product> products;

    public BaseOrder() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public abstract double getTotal();
}
