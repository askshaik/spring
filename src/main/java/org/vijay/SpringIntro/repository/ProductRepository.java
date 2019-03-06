package org.vijay.SpringIntro.repository;
import org.vijay.SpringIntro.domain.Product;

public interface ProductRepository {
	Product getProduct(long id);
}
