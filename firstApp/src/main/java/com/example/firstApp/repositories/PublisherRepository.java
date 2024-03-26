package com.example.firstApp.repositories;

import com.example.firstApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher , Long> {


}
