package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.coffee.domain.Product;
import edu.mum.coffee.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping({ "product" })
	public String findAll(Model model) {
		model.addAttribute("products", productService.getAllProduct());
		return "listofproduct";
	}

	@GetMapping(value = "product/add")
	public String addproduct(@ModelAttribute("product") Product product) {

		return "addproduct";
	}

	@PostMapping(value = "product/add")
	public String addproduct(Product product, BindingResult result) {
		String view = "redirect:/product";

		if (!result.hasErrors()) {

			productService.save(product);
		} else {
			view = "addproduct";
		}

		return view;

	}

	@GetMapping(value = "product/update/{id}")
	public String updateproduct(@PathVariable Integer id, Model model) {
		model.addAttribute("product", productService.getProduct(id));
		return "updateproduct";
	}

	@PostMapping(value = "product/update/{id}")
	public String updateproduct(@PathVariable int id, Product product, BindingResult result) {
		String view = "redirect:/product";

		if (!result.hasErrors()) {
			Product p = productService.getProduct(id);
			p.setProductName(product.getProductName());
			p.setPrice(product.getPrice());
			p.setDescription(product.getDescription());
			p.setProductType(product.getProductType());

			productService.save(p);

		} else {
			view = "updateproduct";
		}

		return view;

	}

	@GetMapping(value = "product/delete/{id}")
	public String delete(@PathVariable int id) {
		productService.delete(productService.getProduct(id));
		return "redirect:/product";
	}

}
