package config;

import model.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.MovieRepository;
import repository.DbMovieRepository;
import service.MovieReport;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public MovieRepository dbMovieRepository(){
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Name1","Genre1"));
        list.add(new Movie("Name2","Genre2"));
        list.add(new Movie("Name3","Genre3"));
        list.add(new Movie("Name4","Genre4"));
        list.add(new Movie("Name5","Genre5"));
        return new DbMovieRepository(list);
    }

}
