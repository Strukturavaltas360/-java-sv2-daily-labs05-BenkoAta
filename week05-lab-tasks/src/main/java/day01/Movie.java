package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> when;

    public Movie(String title, List<LocalDateTime> when) {
        this.title = title;
        this.when = when;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getWhen() {
        return when;
    }
}
