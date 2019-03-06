package org.vijay.SpringIntro.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.vijay.SpringIntro.repository.ProductRepository;
import org.vijay.SpringIntro.repository.ProductRepositoryTestStub;
import org.vijay.SpringIntro.service.ProductService;
import org.vijay.SpringIntro.service.ProductServiceImpl;

@Configuration
public class ProductServiceTestConfig {
	@Bean ProductRepository productRepository(){
		return new ProductRepositoryTestStub();
	}
	@Bean ProductService productService(){
		return new ProductServiceImpl();
	}
}
