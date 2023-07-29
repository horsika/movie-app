package com.example.movieapp.service;

import com.example.movieapp.domain.Movie;
import com.example.movieapp.dto.incoming.MovieCommand;
import com.example.movieapp.dto.outgoing.MovieDetails;
import com.example.movieapp.dto.outgoing.MovieListItem;
import com.example.movieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MovieService {
    private MovieRepository movieRepository;
    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieListItem> getAllMovies() {
        return this.movieRepository.findAll().stream().map(MovieListItem::new).collect(Collectors.toList());
    }
    public MovieDetails getMovieDetails(Long id) {
        return this.movieRepository.findById(id).map(MovieDetails::new).orElseThrow();
    }

    public void saveMovie(MovieCommand movieCommand) {
        Movie movie = new Movie(movieCommand);
        movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

}
