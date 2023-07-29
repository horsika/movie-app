package com.example.movieapp.dto.outgoing;

import com.example.movieapp.domain.Genre;
import com.example.movieapp.domain.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class MovieDetails {
    private long id;
    private String title;
    private String director;
    private long year;
    private List<String> genres;
    private String rating;
    private String url;

    public MovieDetails(Movie movie){
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.director = movie.getDirector();
        this.year = movie.getYear();
        this.genres = movie.getGenres().stream().map(Genre::getDisplayName).collect(Collectors.toList());
        this.rating = movie.getRating().getDescription();
        this.url = movie.getPosterUrl();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public long getYear() {
        return year;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getRating() {
        return rating;
    }

    public String getUrl() {
        return url;
    }
}
