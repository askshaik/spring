package org.vijay.SpringIntro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.vijay.SpringIntro.controller.ProductController;
import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SpringIntroApplication {
	public static void main(String[] args) {
		var ac = run(SpringIntroApplication.class, args);

		var hb = ac.getBean(HelloBean.class);
		System.out.println(hb.sayHello());

		var pc = ac.getBean(ProductController.class);
		var product = pc.get(1L);
		System.out.println(product.getDescription());

		System.exit(0); //Needed when we have web dependency.
	}

}
