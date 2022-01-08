package repository;


import model.Movie;
import repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class DbMovieRepository implements MovieRepository {

    private  List<Movie> moviesList;

    public DbMovieRepository(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    public List<Movie> findAll() {
        return moviesList;
    }
}
