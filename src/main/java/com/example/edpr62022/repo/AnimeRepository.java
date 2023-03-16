package com.example.edpr62022.repo;

import com.example.edpr62022.models.Anime;
import org.springframework.data.repository.CrudRepository;

public interface AnimeRepository extends CrudRepository<Anime, Long> {
    Anime findByName(String name);
}
