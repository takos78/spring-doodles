package guru.springframework.chuckjokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.chuckjokes.service.ChuckNorrisJokes;

@Controller
public class JokesController {

	private ChuckNorrisJokes jokes;
	
	public JokesController() {
		super();
	}

	@Autowired
	public JokesController(ChuckNorrisJokes jokes) {
		this.jokes = jokes;
	}
	
	@RequestMapping("/")
	public String getRandomJoke(Model model) {
		String joke = jokes.getRandomChuckNorrisJoke();
		System.out.println("Returning joke: " + joke);
		
		model.addAttribute("joke", joke);
		return "chucknorris";
	}
	
}
