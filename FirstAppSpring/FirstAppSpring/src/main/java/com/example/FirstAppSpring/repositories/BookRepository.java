package com.example.FirstAppSpring.repositories;

import com.example.FirstAppSpring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
