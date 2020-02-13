package BookingSystems;

import Models.Ticket;

public class BusBooking implements Book {

    @Override
    public void book(Ticket ticket) {
        System.out.print("Booking a bus ticket: " + ticket.toString());
    }
}
