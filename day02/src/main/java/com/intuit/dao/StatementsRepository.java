package com.intuit.dao;

import com.intuit.domain.Statements;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementsRepository extends CrudRepository<Statements, Integer> {

}
