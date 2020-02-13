package BookingSystems;

import Models.Ticket;

public class FlightBooking implements Book {
    @Override
    public void book(Ticket ticket) {
        System.out.print("Booking a flight ticket: " + ticket.toString());
    }
}
