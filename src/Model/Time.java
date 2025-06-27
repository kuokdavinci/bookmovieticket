package Model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String time;
    private List<Movie> movies;
    private List<Chair> chairs;

    public Time(String time, List<Movie> movies) {
        this.time = time;
        this.movies = movies;
        this.chairs = generateChairs();
    }

    public List<Chair> generateChairs() {
        List<Chair> chairs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            chairs.add(new Chair(i, false));
        }
        return chairs;
    }

    public String getTime() {
        return time;
    }

    public List<Movie> getMovies() {
        return movies;
    }
    public List<Chair> getChairs() {return chairs;}

}
