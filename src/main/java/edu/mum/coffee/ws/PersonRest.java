package edu.mum.coffee.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.coffee.domain.Person;
import edu.mum.coffee.service.PersonService;



@RestController
public class PersonRest {

	@Autowired
	//private PersonService personService;
	private PersonService personService;
	
	@GetMapping("/ws/person/findbyemail")
	public List<Person> findByEmail(@RequestParam(value = "email") String email) {
		return personService.findByEmail(email);
	}
	
	@GetMapping("/ws/person/findbyid/{id}")
	public Person findById(@PathVariable Long id) {
		return personService.findById(id);
	}
	
//	@DeleteMapping("/ws/person/remove")
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
	
	@PostMapping("/ws/person/create")
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@PutMapping("/ws/person/update")
	public Person updatePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	
}
