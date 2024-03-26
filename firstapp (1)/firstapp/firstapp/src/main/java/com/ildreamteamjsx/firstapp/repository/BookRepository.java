package com.ildreamteamjsx.firstapp.repository;

import com.ildreamteamjsx.firstapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {
}
