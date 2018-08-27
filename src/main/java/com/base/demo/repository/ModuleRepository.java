package com.base.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.base.demo.entities.Module;

public interface ModuleRepository extends CrudRepository<Module, Long> {

}