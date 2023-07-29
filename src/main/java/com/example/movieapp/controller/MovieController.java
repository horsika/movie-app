package com.example.movieapp.controller;

import com.example.movieapp.dto.incoming.MovieCommand;
import com.example.movieapp.dto.outgoing.MovieDetails;
import com.example.movieapp.dto.outgoing.MovieFormInitData;
import com.example.movieapp.dto.outgoing.MovieListItem;
import com.example.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private MovieService movieService;
    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<MovieListItem>> getMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDetails> getMovieDetails(@PathVariable Long id) {
        return new ResponseEntity<>(movieService.getMovieDetails(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<MovieFormInitData> getMovieFormData() {
        return new ResponseEntity<>(new MovieFormInitData(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Void> addMovie(@RequestBody MovieCommand movieCommand) {
        movieService.saveMovie(movieCommand);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
