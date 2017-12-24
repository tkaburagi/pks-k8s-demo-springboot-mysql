package com.example.demo.repo;
import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.example.demo.model.*;

@JsonSerialize
@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepo extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
			
			public List<Book> findAll();
}
