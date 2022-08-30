package com.internship.site.repository;

import com.internship.site.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepo extends CrudRepository<Country, Integer> {
}
