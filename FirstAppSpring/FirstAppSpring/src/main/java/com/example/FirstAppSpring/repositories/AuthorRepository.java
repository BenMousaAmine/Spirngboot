package com.example.FirstAppSpring.repositories;

import com.example.FirstAppSpring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
