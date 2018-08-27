package com.base.demo.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.base.demo.entities.Role;
import com.base.demo.entities.User;

public interface RoleRepository extends CrudRepository<Role, Long> {

}