import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<_Chair> chairs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            chairs.add(new _Chair(i,false));

        }
        _User user = new _User(1,"AnhQuoc");
        List<_Ticket> tickets = new ArrayList<>();
        List<_Movie> movies = new ArrayList<>();
        _Movie movie0 = new _Movie(0,"A",_Genre.Action,120 );
        _Movie movie1 = new _Movie(1,"B",_Genre.Comedy,100 );
        _Movie movie2 = new _Movie(2,"C",_Genre.SCI_FI,180 );
        _Movie movie3 = new _Movie(3,"D",_Genre.Horror,90 );
        movies.add(movie0);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        List<_Time> times = new ArrayList<>();
        times.add(new _Time("8:00", Arrays.asList(movie0,movie1)));
        times.add(new _Time("12:00",Arrays.asList(movie0,movie1,movie2,movie3)));
        times.add(new _Time("16:00",Arrays.asList(movie0,movie2)));
        _BookTicket book =new _BookTicket();
        book.bookTicket(movies,times,chairs,user,tickets);
    }
}