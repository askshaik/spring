package org.vijay.SpringIntro.repository;
import org.springframework.stereotype.Repository;
import org.vijay.SpringIntro.domain.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	@Override public Product getProduct(long id) {
		var p = new Product();
		p.setDescription("Spring Guru In Action");
		return p;
	}
}
