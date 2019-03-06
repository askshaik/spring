package org.vijay.SpringIntro.repository;
import org.vijay.SpringIntro.domain.Product;

public class ProductRepositoryTestStub implements ProductRepository {
	@Override
	public Product getProduct(long id) {
		Product product = new Product();
		product.setDescription("This is a test product");
		return product;
	}
}