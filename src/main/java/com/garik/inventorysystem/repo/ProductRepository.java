package com.garik.inventorysystem.repo;

import com.garik.inventorysystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
