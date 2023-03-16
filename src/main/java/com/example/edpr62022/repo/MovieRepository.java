package com.example.edpr62022.repo;

import com.example.edpr62022.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
