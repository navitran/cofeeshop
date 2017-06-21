package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import edu.mum.coffee.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping({ "/person/list" })
	public String findAll(Model model) {
		model.addAttribute("persons",personService.findAll());
		return "listofperson";
	}

}
