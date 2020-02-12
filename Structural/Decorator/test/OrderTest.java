import Decorators.PremiumOrder;
import Models.Preorder;
import Models.Product;
import Models.RegularOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    static Product p1, p2, p3;

    @BeforeAll
    public static void init() {
        p1 = new Product(10, "p1");
        p2 = new Product(15, "p2");
        p3 = new Product(30, "p3");
    }

    @Test
    public void shouldReturnCorrectTotalCostForRegularOrder() {
        RegularOrder regularOrder = getRegularOrder();
        assertEquals(regularOrder.getTotal(), 55);
    }

    @Test
    public void shouldReturnTotalCostWithDiscountOf10PercentForPreOrder() {

        RegularOrder regularOrder = getRegularOrder();
        Preorder preorder = getPreOrder();

        assertEquals(preorder.getTotal(), regularOrder.getTotal() * preorder.getDiscountRate());
    }

    @Test
    public void shouldReturnTotalCostWithMore10PercentDiscountOfPareOderForPremiumOrders() {
        Preorder preorder = getPreOrder();

        PremiumOrder premiumOrder = new PremiumOrder(preorder);

        assertEquals(premiumOrder.getTotal(), preorder.getTotal() * preorder.getDiscountRate());
    }

    private static RegularOrder getRegularOrder() {
        RegularOrder regularOrder = new RegularOrder();

        regularOrder.addProduct(p1);
        regularOrder.addProduct(p2);
        regularOrder.addProduct(p3);

        return regularOrder;
    }

    private Preorder getPreOrder() {
        Preorder preorder = new Preorder();
        preorder.addProduct(p1);
        preorder.addProduct(p2);
        preorder.addProduct(p3);
        return preorder;
    }
}
