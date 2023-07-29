package com.example.movieapp.repository;

import com.example.movieapp.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findAll();

    @Override
    Optional<Movie> findById(Long id);
}
