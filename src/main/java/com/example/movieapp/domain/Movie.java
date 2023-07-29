package com.example.movieapp.domain;

import com.example.movieapp.dto.incoming.MovieCommand;
import com.example.movieapp.dto.outgoing.MovieDetails;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "director")
    private String director;
    @Column(name = "year")
    private Long year;
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Genre.class)
    @CollectionTable(name = "movie_genres")
    @Column(name = "movie_genre")
    private List<Genre> genres = new ArrayList<>();
    @Column(name = "rating")
    @Enumerated(EnumType.ORDINAL)
    private Rating rating;
    @Column(name= "poster_url")
    private String posterUrl;


    public Movie() {}

    public Movie(MovieCommand movieCommand){
        this.id = movieCommand.getId();
        this.title = movieCommand.getTitle();
        this.director = movieCommand.getDirector();
        this.year = movieCommand.getYear();
        this.genres = movieCommand.getGenres();
        this.rating = movieCommand.getRating();
        this.posterUrl = movieCommand.getUrl();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
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

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
