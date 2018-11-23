package guru.springframework.chuckjokes.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokesImpl implements ChuckNorrisJokes {

	private ChuckNorrisQuotes quotes;
	

	public ChuckNorrisJokesImpl(ChuckNorrisQuotes quotes) {
		this.quotes = quotes;
	}


	@Override
	public String getRandomChuckNorrisJoke() {
		return quotes.getRandomQuote();
	}

}
