package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mum.coffee.domain.Address;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping({ "/person" })
	public String findAll(Model model) {
		model.addAttribute("persons", personService.findAll());
		return "listofperson";
	}

	@GetMapping(value = "person/addperson")
	public String addPerson(@ModelAttribute("person") Person person, @ModelAttribute("address") Address adddress) {

		return "addperson";
	}

	@PostMapping(value = "person/addperson")
	public String addperson(Person person, Address address, BindingResult result) {
		String view = "redirect:/person";

		if (!result.hasErrors()) {
			person.setAddress(address);
			personService.savePerson(person);
		} else {
			view = "addperson";
		}

		return view;

	}

}
