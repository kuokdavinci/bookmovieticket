package Services;

import Model.Movie;
import Model.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectTime {
    Time selectTime (List<Time> times, Movie selectedMovie, Scanner sc){
        System.out.println("Select your showtime:");
        List<Time> availableTime = new ArrayList<>();
        for(int i=0;i<times.size();i++){
            if(times.get(i).getMovies().contains(selectedMovie)){
                availableTime.add(times.get(i));
                System.out.println(i+": "+availableTime.get(i).getTime());
            }
        }
        System.out.println("Type your movie number to select");
        int timeIndex = sc.nextInt();
        return times.get(timeIndex);
    }
}
