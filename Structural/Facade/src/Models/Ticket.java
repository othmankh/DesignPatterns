package Models;

import java.sql.Time;
import java.util.Date;

public class Ticket {
    public long id;
    public double price;


    public Ticket(long id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Booking ticket: " + id + " which costs: " + price + "\n";
    }


}
