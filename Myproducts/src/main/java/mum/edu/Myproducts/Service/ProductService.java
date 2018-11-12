package mum.edu.Myproducts.Service;

import java.util.List;
import java.util.Optional;

import mum.edu.Myproducts.Model.Product;



public interface ProductService {
	 List<Product> findAll();
	 Product save(Product product);
	Optional <Product> findById(Long id);
	 void deleteById(Long id);
}
