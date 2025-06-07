import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _BookTicket {
    public void bookTicket(List<_Movie> movies, List<_Time> times, List<_Chair> chairs, _User user, List<_Ticket> ticketList){
//SELECT MOVIE
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your movie:");
        for(int i = 0;i<movies.size();i++){
            System.out.println(i+": "+movies.get(i).getMovie_name());
        }
        System.out.println("Type your movie number to select");
        int movieIndex = sc.nextInt();
        _Movie selectedMovie = movies.get(movieIndex);
//SELECT TIME OF MOVIE
        System.out.println("Select your showtime:");
        List<_Time> availableTime = new ArrayList<>();
        for(int i=0;i< times.size();i++){
            if(times.get(i).getMovies().contains(selectedMovie)){
                availableTime.add(times.get(i));
                System.out.println(availableTime.size()-1+": "+availableTime.get(i).getTime());
            }

        }
        System.out.println("Type your movie number to select");
        int timeIndex = sc.nextInt();
        _Time selectedTime = times.get(timeIndex);
//SELECT CHAIR
        System.out.println("Available chair");
        for(int i =0;i<chairs.size();i++)
        {
            System.out.println("Chair "+i+(chairs.get(i).isBooked()?" is booked":" is empty"));
        }
        System.out.println("Select your chair:");
        int chairIndex = sc.nextInt();
        _Chair selectedChair = chairs.get(chairIndex);
        if(!selectedChair.isBooked()){
            selectedChair.setBooked(true);
            _Ticket ticket =new _Ticket(ticketList.size()-1,user,selectedMovie,selectedTime,selectedChair);
            ticketList.add(ticket);
            System.out.println("Booked successfully");

        }else{
            System.out.println("Chair is already booked. Try another !");
        }
    }
}
