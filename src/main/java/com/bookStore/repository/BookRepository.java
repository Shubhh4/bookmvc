package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookStore.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends JpaRepository<Book,Integer> {

}
