package com.techflix.service;

import com.techflix.model.Movie;
import com.techflix.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(String id) {
        return movieRepository.findById(id).orElse(null);
    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }
}
