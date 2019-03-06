package org.vijay.SpringIntro.service;
import org.junit.Before;
import org.junit.Test;
import org.vijay.SpringIntro.domain.Product;
import org.vijay.SpringIntro.repository.ProductRepositoryTestStub;
import static org.junit.Assert.assertEquals;

public class ProductServiceTest {

	private ProductServiceImpl productService;
	@Before
	public void setup(){
		productService = new ProductServiceImpl();
		productService.setProductRepository(new ProductRepositoryTestStub());
	}
	@Test
	public void testGetProduct(){
		Product p = null;
		var product = productService.getProduct(23L);
		assertEquals(product.getDescription(), "This is a test product");
	}

}
