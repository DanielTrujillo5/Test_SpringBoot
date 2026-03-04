package com.epw.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.epw.Product.Entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {
}