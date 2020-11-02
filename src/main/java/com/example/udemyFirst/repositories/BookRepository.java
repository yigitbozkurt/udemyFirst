package com.example.udemyFirst.repositories;

import com.example.udemyFirst.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
