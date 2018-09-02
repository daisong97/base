package com.base.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.base.entities.Role;
import com.base.entities.User;

public interface RoleRepository extends CrudRepository<Role, Long> {

}