package Models;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

    private List<Item> items;

    public Box() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Item item: items) {
           total += item.getTotal();
        }
        return total;
    }
}

