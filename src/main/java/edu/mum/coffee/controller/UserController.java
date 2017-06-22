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
import edu.mum.coffee.domain.User;
import edu.mum.coffee.service.PersonService;
import edu.mum.coffee.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "user/add")
	public String adduser(@ModelAttribute("user") User user, @ModelAttribute("person") Person person,
			@ModelAttribute("address") Address address) {

		return "adduser";
	}

	@PostMapping(value = "user/add")
	public String adduser(User user, Person person, Address address, BindingResult result) {
		String view = "redirect:/login";

		if (!result.hasErrors()) {
			person.setAddress(address);
			user.setPerson(person);
			user.setUserRole("ROLE_USER");
			userService.save(user);

		} else {
			view = "adduser";
		}

		return view;

	}

}
