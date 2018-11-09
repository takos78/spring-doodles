package guru.springframework.chuckjokes.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokesImpl implements ChuckNorrisJokes {

	private ChuckNorrisQuotes quotes;
	
	
	@PostConstruct
	public void init() {
		quotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getRandomChuckNorrisJoke() {
		return quotes.getRandomQuote();
	}

}
