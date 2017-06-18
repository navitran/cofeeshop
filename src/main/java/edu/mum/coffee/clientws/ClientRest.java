package edu.mum.coffee.clientws;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import edu.mum.coffee.domain.Person;

public class ClientRest {

	public static void findPersonById(long id) {
		RestTemplate restTemplate = new RestTemplate();
		final String url = "http://localhost:8080/ws/person/findbyid/" + id;
		Person p = restTemplate.getForObject(url, Person.class);
		System.out.println("First name: " + p.getFirstName());
		System.out.println("Last name: " + p.getLastName());
		System.out.println("Email: " + p.getEmail());
		System.out.println("Address: " + p.getAddress());
		System.out.println("Phone " + p.getPhone());
	}

	public static void findPersonByEmail() {
		RestTemplate restTemplate = new RestTemplate();
		final String url = "http://localhost:8080/ws/person/findbyemail?email=linh@yahoo.com";

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		System.out.println(result);
		// Person p = restTemplate.getForObject(url, Person.class);
		// System.out.println("First name: " + p.getFirstName());
		// System.out.println("Last name: " + p.getLastName());
		// System.out.println("Email: " + p.getEmail());
		// System.out.println("Address: " + p.getAddress());
		// System.out.println("Phone " + p.getPhone());
	}

	public static void update() {
		RestTemplate restTemplate = new RestTemplate();
		final String uri = "http://localhost:8080/ws/person/update";
		Person p = restTemplate.getForObject("http://localhost:8080/ws/person/findbyid/2", Person.class);
		String newFirstName = "updated " + p.getFirstName();
		p.setFirstName(newFirstName);
		restTemplate.put(uri, p);
	}

	public static void save() {
		final String uri = "http://localhost:8080/ws/person/create";
		Person p = new Person();
		p.setFirstName("new Firstname");
		p.setLastName("new lastName");
		p.setEmail("first@gmail.com");
		p.setPhone("9945552345");
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(uri, p, Person.class);

	}

	public static void main(String[] args) {

		// Test cases for consuming Person rest services: find, update, create
		System.out.println("Before udpate");
		System.out.println("*******************");
		System.out.println("Find Person by id 2");
		findPersonById(2);

		System.out.println("*******************");
		System.out.println("test update person id 2 with New First Name: Updated Firstname");
		update();
		System.out.println("After udpate");
		findPersonById(2);
		
		// Test case for create a new person
		System.out.println("*******************");
		System.out.println("creating a new person");
		save();

		System.out.println("*******************");
		System.out.println("Find Person by email");
		findPersonByEmail();

	}

}
