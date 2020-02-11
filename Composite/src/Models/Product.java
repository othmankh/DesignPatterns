package Models;

public class Product implements Item {
    private int price;

    public Product() {

    }

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public double getTotal() {
        return getPrice();
    }
}

