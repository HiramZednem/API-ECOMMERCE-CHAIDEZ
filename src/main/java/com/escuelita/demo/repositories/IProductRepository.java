package com.escuelita.demo.repositories;


import com.escuelita.demo.entities.Product;
import com.escuelita.demo.entities.projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from products where product_type_id=:id", nativeQuery = true)
    List<ProductProjection> getAllProductsByProductTypeId(Long id);
}
