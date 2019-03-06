package org.vijay.SpringIntro.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vijay.SpringIntro.domain.Product;
import org.vijay.SpringIntro.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	ProductRepository pr;
	@Autowired
	public void setProductRepository(ProductRepository pr) {
		this.pr = pr;
	}
	@Override public Product getProduct(long id) {
		return pr.getProduct(id);
	}
}
