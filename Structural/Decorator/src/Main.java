import Decorators.OrderDecorator;
import Decorators.PremiumOrder;
import Models.BaseOrder;
import Models.Preorder;
import Models.Product;
import Models.RegularOrder;

public class Main {
    public static void main(String[] args) {
        BaseOrder order = new RegularOrder();

        order.addProduct(new Product(10, "p1"));
        order.addProduct(new Product(15, "p2"));
        order.addProduct(new Product(20, "p3"));

        Preorder preorder = new Preorder();

        preorder.addProduct(new Product(10, "p1"));
        preorder.addProduct(new Product(15, "p2"));
        preorder.addProduct(new Product(20, "p3"));


        PremiumOrder premiumOrder = new PremiumOrder(preorder);

        System.out.println("Premium Order: " + premiumOrder.getTotal());

        System.out.println("Pre Order: " + preorder.getTotal());

    }
}
