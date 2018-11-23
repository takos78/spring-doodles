package guru.springframework.chuckjokes.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckNorrisJokesConfig {

	@Bean
	public ChuckNorrisQuotes createChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
	
}
