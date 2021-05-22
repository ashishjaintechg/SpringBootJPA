package test.ashishjaintechg.jpa;

import org.junit.jupiter.api.Test;
import test.ashishjaintechg.jpa.entity.Product;
import test.ashishjaintechg.jpa.store.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJpaApplicationTests {
	@Autowired
	ProductRepository productRepository;

	@Test
	void testcreate() {
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("product 1");
		p1.setPrice(1001);
		p1.setDescription("product is excellent");
		productRepository.save(p1);
	}

}
