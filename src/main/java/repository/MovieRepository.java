package repository;

import model.Movie;

import java.util.List;

public interface MovieRepository {
    List <Movie> findAll();
}
