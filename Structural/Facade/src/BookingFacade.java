import BookingSystems.BusBooking;
import BookingSystems.FlightBooking;
import BookingSystems.TrainBooking;
import Models.Ticket;

public class BookingFacade {

    private TrainBooking trainBooking;
    private FlightBooking flightBooking;
    private BusBooking busBooking;

    public BookingFacade() {
        trainBooking = new TrainBooking();
        flightBooking = new FlightBooking();
        busBooking = new BusBooking();
    }

    public void bookTrainTicket(Ticket ticket) {
        trainBooking.book(ticket);
    }

    public void bookFlightTicket(Ticket ticket) {
        flightBooking.book(ticket);
    }

    public void bookBusTicket(Ticket ticket) {
        busBooking.book(ticket);
    }

}
