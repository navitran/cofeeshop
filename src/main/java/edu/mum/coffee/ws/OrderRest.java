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

import edu.mum.coffee.domain.Order;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.service.OrderService;
import edu.mum.coffee.service.PersonService;



@RestController
public class OrderRest {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/ws/order/findall")
	public List<Order> findAll() {
		return orderService.findAll();
	}
	
	
	
	@PostMapping("/ws/order/create")
	public Order save(@RequestBody Order order) {
		return orderService.save(order);
	}
	
	
	
}
