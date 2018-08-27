package com.base.demo.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.base.demo.entities.Privilege;
import com.base.demo.entities.User;

public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {


}