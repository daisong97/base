package com.base.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.base.entities.Privilege;
import com.base.entities.User;

public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {


}