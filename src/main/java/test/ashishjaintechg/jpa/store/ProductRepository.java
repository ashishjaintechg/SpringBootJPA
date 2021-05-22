package test.ashishjaintechg.jpa.store;

import org.springframework.data.repository.CrudRepository;

import test.ashishjaintechg.jpa.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	

}
