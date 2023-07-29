package com.example.movieapp.dto.outgoing;

import com.example.movieapp.domain.Genre;
import com.example.movieapp.domain.Rating;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieFormInitData {

    private List<GenreOptions> genreOptions;
    private List<RatingOptions> ratingOptions;

    public MovieFormInitData() {
        this.genreOptions = Arrays.stream(Genre.values()).map(GenreOptions::new).collect(Collectors.toList());
        this.ratingOptions = Arrays.stream(Rating.values()).map(RatingOptions::new).collect(Collectors.toList());
    }

    public List<GenreOptions> getGenreOptions() {
        return genreOptions;
    }

    public List<RatingOptions> getRatingOptions() {
        return ratingOptions;
    }
}
