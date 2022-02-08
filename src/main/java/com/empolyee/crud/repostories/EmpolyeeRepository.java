package com.empolyee.crud.repostories;

import org.springframework.data.repository.CrudRepository;

import com.empolyee.crud.entities.Empolyee;

public interface EmpolyeeRepository extends CrudRepository<Empolyee, Long> {

}
