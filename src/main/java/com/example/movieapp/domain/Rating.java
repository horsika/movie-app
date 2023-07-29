package com.example.movieapp.domain;

public enum Rating {
    G("G - General Audiences"),
    PG("PG - Parental Guidance Suggested"),
    PG13("PG-13 - Parents Strongly Cautioned"),
    R("R - Restricted"),
    NC17(" NC-17 Adults Only");

    private final String description;

    Rating(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
