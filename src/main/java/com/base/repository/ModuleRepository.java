package com.base.repository;
import org.springframework.data.repository.CrudRepository;

import com.base.entities.Module;

public interface ModuleRepository extends CrudRepository<Module, Long> {

}