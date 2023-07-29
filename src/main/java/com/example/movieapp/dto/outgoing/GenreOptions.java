package com.example.movieapp.dto.outgoing;

import com.example.movieapp.domain.Genre;

public class GenreOptions {

    private String name;

    private String displayName;

    public GenreOptions(Genre genre) {
        this.name = genre.name();
        this.displayName = genre.getDisplayName();
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }
}
