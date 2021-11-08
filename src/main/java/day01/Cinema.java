package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> result = new ArrayList<>();
        for (Movie movie: movies) {
            if (movie.getWhen().contains(time)) {
                result.add(movie.getTitle());
            }
        }
        return result;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
