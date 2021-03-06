import Models.Box;
import Models.Item;
import Models.Order;
import Models.Product;

public class Main {
    public static void main(String[] args) {


        Item smallBox = new Box();

        Item productA = new Product(10);
        Item productB = new Product(5);
        Item productC = new Product(25);
        Item productD = new Product(13);

        ((Box) smallBox).addItem(productA);
        ((Box) smallBox).addItem(productB);
        ((Box) smallBox).addItem(productC);
        ((Box) smallBox).addItem(productD);

        Item bigBox = new Box();
        ((Box) bigBox).addItem(smallBox);

        Item productE = new Product(400);
        Item productF = new Product(200);

        ((Box) bigBox).addItem(productE);
        ((Box) bigBox).addItem(productF);

        Order order = new Order();
        order.addItem(bigBox);
        order.addItem(bigBox);
        order.addItem(smallBox);

        double total = order.getTotal();

        System.out.println("The total is: " + total);
    }
}
