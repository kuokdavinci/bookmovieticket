package Services;

import Model.*;

import java.util.List;
import java.util.Scanner;

public class BookService {
    private final SelectMovie movieSelector = new SelectMovie();
    private final SelectTime timeSelector = new SelectTime();
    private final SelectChair chairSelector = new SelectChair();
    private final CreateTicket ticketCreator = new CreateTicket();

    public void bookTicketService(List<Movie> movies, List<Time> times, User user, List<Ticket> ticketList) {
        Scanner sc = new Scanner(System.in);

        Movie selectedMovie = movieSelector.selectMovie(movies, sc);
        Time selectedTime = timeSelector.selectTime(times, selectedMovie, sc);
        List<Chair> chairs = selectedTime.getChairs();
        Chair selectedChair = chairSelector.selectChair(chairs, sc);

        if (!selectedChair.isBooked()) {
            Ticket ticket = ticketCreator.createTicket(ticketList.size(), user, selectedMovie, selectedTime, selectedChair);
            ticketList.add(ticket);
            System.out.println("Booked successfully");
        } else {
            System.out.println("Chair is already booked. Try another!");
        }
    }
}
