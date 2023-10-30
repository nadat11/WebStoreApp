package com.packt.webstore.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

// KONTROLER - create a product domain object to hold the information about Apple's iPhone 5s and add that object to the model
@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public String list(Model model) {
		Product iPhone = new Product("P1234", "iPhone 6s", new BigDecimal(500));
		iPhone.setDescription(
				"Apple iPhone 6s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera.");
		iPhone.setCategory("Smart phone");
		iPhone.setManufacturer("Apple");
		iPhone.setUnitsInStock(1000);
		// return view name of the products
		model.addAttribute("products", productRepository.getAllProducts());

//		Product samsung = new Product("Samsung J6" , "J6/2016", new BigDecimal(300));
//		samsung.setDescription("Samsung smart phone");
//		samsung.setCategory("Smart phone");
//		samsung.setManufacturer("Samsung");
//		samsung.setUnitsInStock(100);
//		model.addAttribute("product",samsung);

		return "products";
	}
	
	
	@RequestMapping("/update/stock")
	public String updateStock(Model model) {
	productService.updateAllStock();
	return "redirect:/products";
	}
}