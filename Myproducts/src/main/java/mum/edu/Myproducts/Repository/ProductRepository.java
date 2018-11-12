package mum.edu.Myproducts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.Myproducts.Model.Product;


@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
