package com.example.edpr62022.repo;

import com.example.edpr62022.models.Type;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<Type, Long> {
    Type findByStreet(String street);
}
