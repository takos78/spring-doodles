package my.doodles.spring.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import my.doodles.spring.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
