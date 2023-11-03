package com.example.prestiticountry.repository;

import com.example.prestiticountry.domain.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository  extends CrudRepository <Country,Long>{
}
