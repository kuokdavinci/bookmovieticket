package Services;

import Model.Movie;

import java.util.List;
import java.util.Scanner;

public class SelectMovie {
    public Movie selectMovie (List<Movie> movies, Scanner sc){
        System.out.println("Select your movie:");
        for(int i = 0;i<movies.size();i++){
            System.out.println(i+": "+movies.get(i).getMovie_name());
        }
        System.out.println("Type your movie number to select");
        int movieIndex = sc.nextInt();
        return movies.get(movieIndex);
    }
}
