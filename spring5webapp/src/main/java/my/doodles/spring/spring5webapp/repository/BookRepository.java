package my.doodles.spring.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import my.doodles.spring.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
