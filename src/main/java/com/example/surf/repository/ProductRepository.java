package com.example.surf.repository;

import com.example.surf.entity.Product;
import com.example.surf.entity.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    public List<Product> findByProductType(ProductType productType);
}
