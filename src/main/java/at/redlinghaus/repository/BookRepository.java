package at.redlinghaus.repository;

import at.redlinghaus.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
