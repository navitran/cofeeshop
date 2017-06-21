package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import edu.mum.coffee.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping({ "/order" })
	public String findAll(Model model) {
		model.addAttribute("orders", orderService.findAll());
		return "listoforder";
	}

}
