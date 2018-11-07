package my.doodles.spring.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import my.doodles.spring.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
