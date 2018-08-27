package com.base.demo.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.base.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByUserName(String userName);
}