package my.doodles.spring.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import my.doodles.spring.spring5webapp.model.Author;
import my.doodles.spring.spring5webapp.model.Book;
import my.doodles.spring.spring5webapp.model.Publisher;
import my.doodles.spring.spring5webapp.repository.AuthorRepository;
import my.doodles.spring.spring5webapp.repository.BookRepository;
import my.doodles.spring.spring5webapp.repository.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private PublisherRepository publisherRepository;
	
	private AuthorRepository authorRepository;
	
	private BookRepository bookRepository;
	
	public DevBootstrap(PublisherRepository publisherRepository, AuthorRepository authorRepository, BookRepository bookRepository) {
		this.publisherRepository = publisherRepository;
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}



	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
	
    private void initData() {
    	System.out.println("Adding DEV data to DB...");
    	
    	Publisher harper = new Publisher("Harper Collins", "Harper Address 12");
    	
    	Author eric = new Author("Eric", "Evans");
    	Book ddd = new Book("Domain Driven Desing", "1234", harper);
    	eric.getBooks().add(ddd);
    	ddd.getAuthors().add(eric);
    	publisherRepository.save(harper);
    	authorRepository.save(eric);
    	bookRepository.save(ddd);
    	
    	
    	Publisher work = new Publisher("Work", "Work Address 34");
    	
    	Author rob = new Author("Rob", "Johnson");
    	Book noEjb = new Book("J2EE Development without EJB", "23444", work);
    	rob.getBooks().add(noEjb);
    	noEjb.getAuthors().add(rob);
    	publisherRepository.save(work);
    	authorRepository.save(rob);
    	bookRepository.save(noEjb);
    	
    }

}
