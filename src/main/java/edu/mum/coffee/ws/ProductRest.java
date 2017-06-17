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
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.domain.ProductType;
import edu.mum.coffee.service.PersonService;
import edu.mum.coffee.service.ProductService;



@RestController
public class ProductRest {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/ws/product/findbyprice")
	public List<Product> findByPrice(@RequestParam(value="min") double minPrice, @RequestParam(value="max") double maxPrice) {
		return productService.findByPrice(minPrice, maxPrice);
	}
	
	@GetMapping("/ws/product/findbyProductType/{productType}")
	public List<Product> findbyProductType(@PathVariable ProductType productType) {
		return productService.findByProductType(productType);
	}
	
	
	@GetMapping("/ws/product/findbytextsearch/{criteria}")
	public List<Product> findbyTextSearch(@PathVariable String criteria) {
		return productService.findByTextSearch(criteria);
	}
	
	@GetMapping("/ws/product/findall")
	public List<Product> findAll() {
		return productService.getAllProduct();
	}
	
	@GetMapping("/ws/product/findbyid/{productId}")
	public Product findById(@PathVariable int productId) {
		return productService.getProduct(productId);
	}
	
	@DeleteMapping("/ws/product/remove")
	public String delete(@RequestBody Product product) {
		try {
			
			productService.delete(product);
			
		} catch (Exception e) {
			return "Failed to remove";
		}
		return "Removed successfully";
		
	}
	
	@PostMapping("/ws/product/create")
	public Product save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@PutMapping("/ws/product/update")
	public Product update(@RequestBody Product product) {
		return productService.save(product);
	}
	
	
}
