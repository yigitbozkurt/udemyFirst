package com.example.udemyFirst.repositories;

import com.example.udemyFirst.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
