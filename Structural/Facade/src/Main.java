import Models.Ticket;

public class Main {
    public static void main(String[] args) {
        BookingFacade booking = new BookingFacade();

        booking.bookBusTicket(new Ticket(1, 30));
        booking.bookFlightTicket(new Ticket(2, 352));
        booking.bookTrainTicket(new Ticket(3, 175));

    }
}


