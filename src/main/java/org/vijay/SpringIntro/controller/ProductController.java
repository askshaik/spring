package org.vijay.SpringIntro.controller;
import org.springframework.stereotype.Controller;
import org.vijay.SpringIntro.domain.Product;
import org.vijay.SpringIntro.service.ProductService;

@Controller
public class ProductController {
	ProductService ps;
	public ProductController(ProductService ps) {
		this.ps = ps;
	}
	public Product get(long id) {
		return ps.getProduct(id);
	}
}
