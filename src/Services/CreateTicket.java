package Services;

import Model.*;

public class CreateTicket {
    public Ticket createTicket(int ticket_id, User user, Movie movie, Time time, Chair chair){
        chair.setBooked(true);
        return new Ticket(ticket_id,user,movie,time,chair);
    }
}
