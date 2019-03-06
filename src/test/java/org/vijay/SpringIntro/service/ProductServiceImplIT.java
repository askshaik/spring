package org.vijay.SpringIntro.service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.vijay.SpringIntro.config.ProductServiceTestConfig;
import org.vijay.SpringIntro.domain.Product;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ProductServiceTestConfig.class})
public class ProductServiceImplIT { //Integration test
	private ProductService productService;
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	@Test
	public void testGetProduct(){
		Product product = productService.getProduct(1L);
		assertEquals(product.getDescription(), "This is a test product");
	}
}
