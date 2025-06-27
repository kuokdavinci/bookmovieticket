package Model;

public class Ticket {
    private int ticket_id;
    private User user;
    private Movie movie;
    private Chair chair;
    private Time time;

    public Ticket(int ticket_id, User user, Movie movie, Time time, Chair chair ){
        this.ticket_id = ticket_id;
        this.user = user;
        this.movie = movie;
        this.chair = chair;
        this.time = time;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public Chair getChair() {
        return chair;
    }

    public Time getTime() {
        return time;
    }

}
