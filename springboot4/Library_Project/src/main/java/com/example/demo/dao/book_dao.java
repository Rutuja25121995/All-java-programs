package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Book;
@Repository
public interface book_dao extends CrudRepository<Book, Integer> {

}
