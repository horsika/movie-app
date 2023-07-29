package com.example.movieapp.dto.incoming;

import com.example.movieapp.domain.Genre;
import com.example.movieapp.domain.Rating;

import java.util.List;

public class MovieCommand {

    private long id;
    private String title;
    private String director;
    private long year;
    private List<Genre> genres;
    private Rating rating;
    private String url;

    public MovieCommand(long id, String title, String director, long year, List<Genre> genres, Rating rating, String url) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
        this.genres = genres;
        this.rating = rating;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
