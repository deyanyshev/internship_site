package com.internship.site.repository;

import com.internship.site.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    List<User> findById(int id);
    List<User> findByLogin(String login);
}
