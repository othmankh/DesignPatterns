package BookingSystems;

import Models.Ticket;

public class TrainBooking implements Book {
    @Override
    public void book(Ticket ticket) {
        System.out.print("Booking a train ticket: " + ticket.toString());
    }
}

