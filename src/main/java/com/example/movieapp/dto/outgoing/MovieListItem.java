package com.example.movieapp.dto.outgoing;

import com.example.movieapp.domain.Movie;

public class MovieListItem {

    private long id;
    private String title;
    private String director;
    private long year;

    public MovieListItem(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.director = movie.getDirector();
        this.year = movie.getYear();
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
}
