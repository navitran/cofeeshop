package edu.mum.coffee.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.coffee.domain.Person;
import edu.mum.coffee.service.PersonService;



@RestController
public class PersonRest {

	@Autowired
	//private PersonService personService;
	private PersonService personService;
	
	@GetMapping("/person/findbyemail/{email}")
	public List<Person> findByEmail(@PathVariable String email) {
		return personService.findByEmail(email);
	}
	
	@GetMapping("/person/findbyid/{id}")
	public Person findById(@PathVariable Long id) {
		return personService.findById(id);
	}
	
//	@DeleteMapping("/person/remove")
//	public String removePerson(Person person) {
//		try {
//			
//			personService.removePerson(person);
//			
//		} catch (Exception e) {
//			return "Failed to remove";
//		}
//		return "Removed successfully";
//		
//	}
	
	@PostMapping("/person/create")
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@PutMapping("/person/update")
	public Person updatePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	
}
