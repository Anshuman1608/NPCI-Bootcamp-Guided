package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.AllTransactions;

@RepositoryRestResource(path = "transact")
@CrossOrigin("http://localhost:4200/")
public interface AllTransactionDAO extends JpaRepository<AllTransactions, Integer> {

}
