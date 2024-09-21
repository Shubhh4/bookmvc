package com.bookStore.service;

import com.bookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookStore.entity.Book;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;
    public void save(Book b){

        bRepo.save(b);
    }
    public List<Book> getAllBook(){
        return bRepo.findAll();
    }

    public Book getBookById(int id){
        Book book= bRepo.findById(id).get();
        return book;
    }

    public void deleteById(int id){
        bRepo.deleteById(id);
    }
}
