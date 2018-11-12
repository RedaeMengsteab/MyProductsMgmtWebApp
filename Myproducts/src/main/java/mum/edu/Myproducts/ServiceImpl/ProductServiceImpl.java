package mum.edu.Myproducts.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.Myproducts.Model.Product;
import mum.edu.Myproducts.Repository.ProductRepository;
import mum.edu.Myproducts.Service.ProductService;



@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

}
