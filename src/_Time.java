import java.util.List;

public class _Time {
    private String time;
    private List<_Movie> movies;

    public _Time(String time,List<_Movie> movies) {
        this.time = time;
        this.movies = movies;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<_Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<_Movie> movies) {
        this.movies = movies;
    }
}
