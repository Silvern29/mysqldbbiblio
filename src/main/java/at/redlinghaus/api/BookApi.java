package at.redlinghaus.api;

import at.redlinghaus.controller.BookController;
import at.redlinghaus.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookApi {
    @Autowired
    private BookController bookController;

    @PostMapping("/books")
    public void createBook(@RequestBody Book book) {
        bookController.createBook(book);
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {
        return bookController.updateBook(book);
    }

    @GetMapping("/books")
    public Iterable<Book> getAll(){
        return bookController.findAll();
    }


}
