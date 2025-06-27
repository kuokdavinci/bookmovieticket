package Model;

public class Movie {
    private int movie_id;
    private String movie_name;
    private Genre genre;
    private int duration;

    public Movie(int movieId, String movieName, Genre genre, int duration) {
        movie_id = movieId;
        movie_name = movieName;
        this.genre = genre;
        this.duration = duration;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\nModel.Movie: "+movie_name+"\n"+"Model.Genre: "+genre+" - Duration: "+ duration;
    }
}
