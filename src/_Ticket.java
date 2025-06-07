
public class _Ticket {
    private int ticket_id;
    private _User user;
    private _Movie movie;
    private _Chair chair;
    private _Time time;

    public _Ticket (int ticket_id, _User user,_Movie movie, _Time time, _Chair chair ){
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

    public _User getUser() {
        return user;
    }

    public _Movie getMovie() {
        return movie;
    }

    public _Chair getChair() {
        return chair;
    }

    public _Time getTime() {
        return time;
    }

}
