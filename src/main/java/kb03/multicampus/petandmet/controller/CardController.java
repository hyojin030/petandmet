package kb03.multicampus.petandmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController {

	@Autowired
	private CardRepository cardRepository;
	
	
	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
	
}