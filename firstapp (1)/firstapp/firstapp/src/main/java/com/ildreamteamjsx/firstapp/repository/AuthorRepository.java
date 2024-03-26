package com.ildreamteamjsx.firstapp.repository;

import com.ildreamteamjsx.firstapp.domain.Author;
import com.ildreamteamjsx.firstapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
