package com.example.movieapp.dto.outgoing;

import com.example.movieapp.domain.Rating;

public class RatingOptions {

    private String name;

    private String description;

    public RatingOptions(Rating rating) {
        this.name = rating.name();
        this.description = rating.getDescription();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
