package org.vijay.SpringIntro.repository;
import org.junit.Test;
import org.vijay.SpringIntro.domain.Product;
import static org.junit.Assert.assertEquals;

public class ProductRepositoryTest {
	@Test
	public void testGetProduct(){
		ProductRepositoryImpl repository = new ProductRepositoryImpl();
		var product = repository.getProduct(1l);
		assertEquals(product.getDescription(), "Spring Guru In Action");
	}
}
