package service;


import model.Movie;
import repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class DbMovieRepository implements MovieRepository {

    public List<Movie> findAll() {
        List<Movie> list=new ArrayList<>();
        list.add(new Movie("Name1","Genre1"));
        list.add(new Movie("Name2","Genre2"));
        list.add(new Movie("Name3","Genre3"));
        list.add(new Movie("Name4","Genre4"));
        list.add(new Movie("Name5","Genre5"));
        return list;
    }
}
