package at.redlinghaus.controller;

import at.redlinghaus.entity.Book;
import at.redlinghaus.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookRepository repository;

    public void createBook(Book book) {
        repository.save(book);
    }

    public Book updateBook(Book book) {
        return repository.save(book);
    }

    public Iterable<Book> findAll() {
        return repository.findAll();
    }
}
